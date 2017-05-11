package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.service.DayPlanService;
import com.bysj.rj.service.TruckPlanService;
import com.bysj.rj.util.TruckUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 龙 on 2017/5/5.
 */

@Controller
public class TruckPlanController {
    protected Logger logger = Logger.getLogger(TruckPlanController.class);

    @Autowired
    private TruckPlanService truckPlanService;
    @Resource
    private DayPlanService dayPlanService;

    @GetMapping("/")
    public String  IndexWillDoPlan(HttpServletRequest request, HttpServletResponse response){
        List<TruckPlanEntity> truckPlanEntityList=truckPlanService.getTruckPlanAll();
        request.setAttribute("truckPlanEntityList",truckPlanEntityList);
        return "willDoPlan";
    }

    @PostMapping("/addPlan")
    public void  addPlan(HttpServletRequest request, HttpServletResponse response ){
        String truckPlanEntity=request.getParameter("truckPlanEntity");
        String dayPlanArry=request.getParameter("dayPlanArry");
        JSONArray jsonArray=JSON.parseArray(dayPlanArry);
        List<DayPlanEntity> dayPlanEntityList=JSONObject.parseArray(dayPlanArry,DayPlanEntity.class);
        TruckPlanEntity truckPlan = JSON.parseObject(truckPlanEntity,TruckPlanEntity.class);
        int result=truckPlanService.addPlan(truckPlan,dayPlanEntityList);
        JSONObject resultMsg=new JSONObject();
        if(result>0){
            resultMsg.put("msg",true);
        }else{
            resultMsg.put("msg",false);
        }
        TruckUtil.writer(response,resultMsg);
    }

    @GetMapping("/editTruckPlan")
    public void  editTruckPlan(HttpServletRequest request, HttpServletResponse response ){
        String planId=request.getParameter("planId");
        TruckPlanEntity truckPlanEntity=truckPlanService.getEntityById(Long.parseLong(planId));
        List<DayPlanEntity> dayPlanEntityList=dayPlanService.getEntiyListByPlanID(Long.parseLong(planId));
        JSONObject data=new JSONObject();
        data.put("dayPlanEntityList",dayPlanEntityList);
        data.put("truckPlanEntity",truckPlanEntity);
        TruckUtil.writer(response,data);
    }



}
