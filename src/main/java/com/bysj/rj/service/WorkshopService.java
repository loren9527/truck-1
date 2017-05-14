package com.bysj.rj.service;

import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.dao.DayPlanEntityMapper;
import com.bysj.rj.dao.TruckPlanEntityMapper;
import com.bysj.rj.dao.WorkshopEntityMapper;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.entity.WorkshopEntity;
import com.bysj.rj.entity.WorkshopEntityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 龙 on 2017/5/13.
 */
@Service
public class WorkshopService {
    @Resource
    private WorkshopEntityMapper workshopEntityMapper;
@Resource
private DayPlanService dayPlanService;
    @Resource
    private TruckPlanService truckPlanService;

    public List<WorkshopEntity> canWorkEntity() {
        WorkshopEntityExample example=new WorkshopEntityExample();
        example.or().andHealthEqualTo((byte)1).//1代表健康  0代表坏了
                andWorkStateEqualTo((byte)1); //1代表空闲  0代表正在工作
        return workshopEntityMapper.selectByExample(example);
    }

    public int doDayPlan(String dayPlanId, String workshopName) {
       WorkshopEntity workshopEntity=new WorkshopEntity();
        workshopEntity.setDpId(Long.parseLong(dayPlanId));
        workshopEntity.setWorkState((byte)0);
        WorkshopEntityExample example=new WorkshopEntityExample();
        example.or().andNameEqualTo(workshopName);
      return  workshopEntityMapper.updateByExampleSelective(workshopEntity,example);
    }

    public List<WorkshopEntity> getWorkshopList() {
        WorkshopEntityExample example=new WorkshopEntityExample();
        return workshopEntityMapper.selectByExample(example);
    }

    public void initWorkshop(JSONObject resultJSON) {
        SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy/MM/dd");
        List<WorkshopEntity> workshopEntityList= getWorkshopList();
       for (int i=0;i<workshopEntityList.size();i++){
           DayPlanEntity dayPlanEntity= dayPlanService.getEntiyByDpID(workshopEntityList.get(i).getDpId());
           TruckPlanEntity truckPlanEntity=truckPlanService.getEntityById(dayPlanEntity.getTruckPlanId());
           resultJSON.put("workshop"+i,workshopEntityList.get(i));
           resultJSON.put("truckPlanNumber"+i,truckPlanEntity.getPlanNumber());
           resultJSON.put("truckType"+i,truckPlanEntity.getTruckType());
           resultJSON.put("dayPlanDate"+i,dateFormat.format(new Date(dayPlanEntity.getDate())));
       }
    }
}
