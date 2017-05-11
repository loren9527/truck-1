package com.bysj.rj.service;

import com.bysj.rj.dao.DayPlanEntityMapper;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.DayPlanEntityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 龙 on 2017/5/11.
 */
@Service
public class DayPlanService {

    @Resource
    private DayPlanEntityMapper dayPanEntityMapper;
    public List<DayPlanEntity> getEntiyListByPlanID(Long planId) {
        DayPlanEntityExample dayPlanEntityExample=new DayPlanEntityExample();
        dayPlanEntityExample.or().andTruckPlanIdEqualTo(planId);
        return dayPanEntityMapper.selectByExample(dayPlanEntityExample);
    }
}
