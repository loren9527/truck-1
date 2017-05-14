package com.bysj.rj.util;

import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.controller.TruckPlanController;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 龙 on 2017/5/11.
 */
public class TruckUtil {
    protected static Logger logger = Logger.getLogger(TruckPlanController.class);

    public  static void writer(HttpServletResponse response, JSONObject jsonObject){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            logger.error("获取输出流异常");
        }
        System.out.print(jsonObject.toJSONString());
        out.println(jsonObject.toJSONString());
        out.flush();
        out.close();
    }
}
