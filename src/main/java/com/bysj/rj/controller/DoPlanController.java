package com.bysj.rj.controller;

import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.service.TruckPlanService;
import com.bysj.rj.service.WorkshopService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 龙 on 2017/5/13.
 */
@Controller
public class DoPlanController {
    protected Logger logger = Logger.getLogger(TruckPlanController.class);

    @Autowired
    private TruckPlanService truckPlanService;
    @Resource
    private WorkshopService workshopService;

    @GetMapping("/doPlan")
    public String  IndexDoPlan(HttpServletRequest request, HttpServletResponse response){
        JSONObject resultJSON=new JSONObject();
        workshopService.initWorkshop(resultJSON);
        request.setAttribute("resultJSON",resultJSON);
        return "doPlan";
    }


}
