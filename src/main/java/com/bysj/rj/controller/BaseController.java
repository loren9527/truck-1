package com.bysj.rj.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/4 0004.
 */
public class BaseController {
    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    protected Logger logger = Logger.getLogger(BaseController.class);
}
