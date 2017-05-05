package com.bysj.rj.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
@Controller
public class IndexController {
    private Logger logger = Logger.getLogger(IndexController.class);
    @Autowired
    private IService userService;

    @Autowired
    private HttpServletRequest request;
    @GetMapping("/")
    public ModelAndView indexView(){
        ModelAndView model = new ModelAndView();
        logger.info(request.getContextPath()+"sssssss");
        model.setViewName("partsList");
        return model;
    }
}
