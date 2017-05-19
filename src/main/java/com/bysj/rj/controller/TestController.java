package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.service.TruckProduceDtoScervice;
import com.bysj.rj.util.ConstantString;
import com.bysj.rj.util.CreateTruck;
import com.bysj.rj.util.CreateUtil;
import com.bysj.rj.util.TruckUtil;
import com.bysj.rj.websocket.WebsocketHandler;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bysj.rj.entity.TruckProduceDto;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by 龙 on 2017/5/14.
 */
@Controller
public class TestController {
    protected static final Logger LOG = Logger.getLogger(TestController.class);

    @Resource
    private CreateTruck createTruck;

    @Resource
    private CreateUtil createUtil;

    @RequestMapping("/start")
    protected void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Thread thread1=new Thread(createTruck);
        thread1.start();
        JSONObject message=new JSONObject();
        message.put("msg",true);
        TruckUtil.writer(response,message);

    }

    @RequestMapping("/ccc")
    protected void log(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Thread thread=new Thread(createUtil);
        thread.start();
        JSONObject message=new JSONObject();
        message.put("msg",true);
        TruckUtil.writer(response,message);
    }
}
