package com.bysj.rj.service;


import com.bysj.rj.dao.DayPlanEntityMapper;
import com.bysj.rj.dao.TruckPlanEntityMapper;
import com.bysj.rj.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class TruckPlanService{
	@Resource
	private TruckPlanEntityMapper truckPlanEntityMapper;
	@Resource
	private DayPlanEntityMapper dayPlanEntityMapper;

	public List<TruckPlanEntity> getTruckPlanAll(){
		SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy-MM-dd");
		TruckPlanEntityExample truckPlanEntityExample=new TruckPlanEntityExample();
		 List<TruckPlanEntity> truckPlanEntityList=truckPlanEntityMapper.selectByExample(truckPlanEntityExample);
		for (TruckPlanEntity truckPlanEntity : truckPlanEntityList) {
			if (truckPlanEntity.getFinishDate() != null)
				truckPlanEntity.setStrFinishDate(dateFormat.format(new Date(truckPlanEntity.getFinishDate())));
			if (truckPlanEntity.getPlanDate() != null)
				truckPlanEntity.setStrPlanDate(dateFormat.format(new Date(truckPlanEntity.getPlanDate())));
			if (truckPlanEntity.getProduceDate() != null)
				truckPlanEntity.setStrProduceDate(dateFormat.format(new Date(truckPlanEntity.getProduceDate())));
		}
		return  truckPlanEntityList;
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
    public int addPlan(TruckPlanEntity truckPlanEntity, List<DayPlanEntity> dayPlanEntityList) {
		if(truckPlanEntity==null){
			return 0;
		}
		int truckPlanResult =  truckPlanEntityMapper.insert(truckPlanEntity);
		if(truckPlanResult>0){
			if(dayPlanEntityList.size()>0){
				Long planID=truckPlanEntity.getPlanId();
				for(DayPlanEntity item : dayPlanEntityList){
					item.setTruckPlanId(planID);
				}
				int dayPlanResult = dayPlanEntityMapper.insertBatch(dayPlanEntityList);
				return dayPlanResult>0?1:0;
			}
			return 1;
		}
		else {
			return 0;
		}
    }

	public TruckPlanEntity getEntityById(long planId) {
		SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy-MM-dd");
		TruckPlanEntity truckPlanEntity=truckPlanEntityMapper.selectByPrimaryKey(planId);
		if (truckPlanEntity.getFinishDate() != null)
			truckPlanEntity.setStrFinishDate(dateFormat.format(new Date(truckPlanEntity.getFinishDate())));
		if (truckPlanEntity.getPlanDate() != null)
			truckPlanEntity.setStrPlanDate(dateFormat.format(new Date(truckPlanEntity.getPlanDate())));
		if (truckPlanEntity.getProduceDate() != null)
			truckPlanEntity.setStrProduceDate(dateFormat.format(new Date(truckPlanEntity.getProduceDate())));
		return  truckPlanEntity;
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
    public int delEntityById(long planId) {
    	return truckPlanEntityMapper.deleteByPrimaryKey(planId);
    }

	@Transactional(isolation = Isolation.READ_COMMITTED)
    public int editPlan(TruckPlanEntity truckPlanEntity, List<DayPlanEntity> dayPlanEntityList) {
		if(truckPlanEntity==null){
			return 0;
		}
		int truckPlanResult =  truckPlanEntityMapper.updateByPrimaryKey(truckPlanEntity);
		if(truckPlanResult>0){
			DayPlanEntityExample dayPlanEntityExample=new DayPlanEntityExample();
			dayPlanEntityExample.or().andTruckPlanIdEqualTo(truckPlanEntity.getPlanId());
			dayPlanEntityMapper.deleteByExample(dayPlanEntityExample);
			if(dayPlanEntityList.size()>0){
				Long planID=truckPlanEntity.getPlanId();
				for(DayPlanEntity item : dayPlanEntityList){
					item.setTruckPlanId(planID);
				}
				int dayPlanResult = dayPlanEntityMapper.insertBatch(dayPlanEntityList);  //两个mapper需要用到原来的 truckplan dayplan
				return dayPlanResult>0?1:0;
			}
			return 1;
		}
		else {
			return 0;
		}

    }
}
