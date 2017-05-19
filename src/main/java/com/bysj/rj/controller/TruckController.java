package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.entity.TruckEntity;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.service.TruckPlanService;
import com.bysj.rj.service.TruckService;
import com.bysj.rj.util.TruckUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by 龙 on 2017/5/13.
 */
@Controller
public class TruckController {
    @Resource
    private TruckService truckService;
    @Resource
    private TruckPlanService truckPlanService;


    @GetMapping("/statistics")
    public  String statistics(HttpServletResponse response, HttpServletRequest request){
        JSONObject resultJSON=new JSONObject();
        truckService.fillEchartData(resultJSON);
        request.setAttribute("resultJSON",resultJSON);
        return  "statistics";
    }

    @GetMapping("/goodBad")
    public  void goodBad(HttpServletResponse response, HttpServletRequest request){
        JSONObject resultJSON=new JSONObject();
        truckService.fillGoodOrBad(resultJSON,request.getParameter("truckType").trim());
        TruckUtil.writer(response,resultJSON);
    }

    @GetMapping("/truckSelect")
    public  String  indexTruckSelect(HttpServletResponse response, HttpServletRequest request){
        List<TruckPlanEntity> truckPlanEntityList=truckPlanService.getTruckPlanAll( );
        request.setAttribute("truckPlanEntityList",truckPlanEntityList);
        return "truckSelect";
    }

    @GetMapping("/selectTruck1")
    public  void  selectTruck1(HttpServletResponse response, HttpServletRequest request){
        String planId=request.getParameter("planId").trim();
        String planNumber=truckPlanService.getEntityById(Long.parseLong(planId)).getPlanNumber();
        List<TruckEntity> truckEntiyList=truckService.getTruckAll(planNumber);
        JSONObject data=new JSONObject();
        data.put("truckEntiyList",truckEntiyList);
        TruckUtil.writer(response,data);
    }



}
