package com.bysj.rj.service;


import com.bysj.rj.dao.DayPlanEntityMapper;
import com.bysj.rj.dao.TruckPlanEntityMapper;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.entity.TruckPlanEntityExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TruckPlanService{
	@Resource
	private TruckPlanEntityMapper truckPlanEntityMapper;
	@Resource
	private DayPlanEntityMapper dayPlanEntityMapper;

	public List<TruckPlanEntity> getTruckPlanAll(){
		TruckPlanEntityExample truckPlanEntityExample=new TruckPlanEntityExample();
		return  truckPlanEntityMapper.selectByExample(truckPlanEntityExample);
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
    public int addPlan(TruckPlanEntity truckPlanEntity, List<DayPlanEntity> dayPlanEntityList) {
		int truckPlanResult =  truckPlanEntityMapper.insert(truckPlanEntity);
		if(truckPlanResult>0){
			Long planID=truckPlanEntity.getPlanId();
			for(DayPlanEntity item : dayPlanEntityList){
				item.setTruckPlanId(planID);
			}
			int dayPlanResult = dayPlanEntityMapper.insertBatch(dayPlanEntityList);
			return dayPlanResult>0?1:0;
		}
		else {
			return 0;
		}
    }

	public TruckPlanEntity getEntityById(long planId) {
		return  truckPlanEntityMapper.selectByPrimaryKey(planId);
	}
}
