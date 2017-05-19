package com.bysj.rj.service;

import com.bysj.rj.dao.DayPlanEntityMapper;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.DayPlanEntityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by 龙 on 2017/5/11.
 */
@Service
public class DayPlanService {

    @Resource
    private DayPlanEntityMapper dayPanEntityMapper;
    public List<DayPlanEntity> getEntiyListByPlanID(Long planId) {
        SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy/MM/dd");

        DayPlanEntityExample dayPlanEntityExample=new DayPlanEntityExample();
        dayPlanEntityExample.or().andTruckPlanIdEqualTo(planId);
       List<DayPlanEntity> dayPlanEntityList= dayPanEntityMapper.selectByExample(dayPlanEntityExample);
        for (DayPlanEntity dayPlanEntity:dayPlanEntityList)
            dayPlanEntity.setStrDate(dateFormat.format(dayPlanEntity.getDate()*1000));
        return dayPlanEntityList;
    }

    public DayPlanEntity getEntiyByDpID(Long dpId) {
        SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy/MM/dd");
        DayPlanEntity dayPlanEntity=dayPanEntityMapper.selectByPrimaryKey(dpId);
        if(dayPlanEntity.getDate()!=null){
            dayPlanEntity.setStrDate(dateFormat.format(dayPlanEntity.getDate()*1000));
        }
        return   dayPlanEntity;
    }
}
