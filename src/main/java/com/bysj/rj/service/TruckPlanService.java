package com.bysj.rj.service;


import com.bysj.rj.dao.TruckPlanEntityMapper;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.entity.TruckPlanEntityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class TruckPlanService{
	@Resource
	private TruckPlanEntityMapper truckPlanEntityMapper;


}
