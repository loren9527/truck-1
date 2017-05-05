package com.bysj.rj.service;



import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class TruckPlanService{
	@Resource
	private TruckPlanEntityMapper truckPlanEntityMapper;


}
