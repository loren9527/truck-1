package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.entity.UsersEntity;
import com.bysj.rj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/9 0009.
 */
@Controller
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    //@GetMapping("/")
    public ModelAndView loginView(){
        ModelAndView model = new ModelAndView();
        model.setViewName("page-login");
        return model;
    }

    @GetMapping("/page-register")
    public ModelAndView registerView(){
        ModelAndView model = new ModelAndView();
        model.setViewName("page-register");
        model.addObject("key","value");
        return model;
    }

    @PostMapping("register")
    public ModelAndView register(UsersEntity user){
        ModelAndView model = new ModelAndView();
        try {
            logger.info(JSON.toJSONString(user));
            int id = userService.registerAccount(user);
            logger.info("注册账号的id为："+id);
            model.addObject("registerInfo","success");
            model.setViewName("page-login");
        } catch (Exception e) {
            model.addObject("registerInfo","fail");
            model.setViewName("page-register");
            logger.info("注册失败"+e.getMessage());
        }
        return model;
    }
    @PostMapping("login")
    public ModelAndView loginCheck(UsersEntity user){
        ModelAndView modelAndView = new ModelAndView();
        UsersEntity userEntity = userService.loginCheck(user);
        if(null != userEntity){
            request.getSession().setAttribute("user",userEntity);
            modelAndView.setViewName("redirect:/partsList");
        }else {
            modelAndView.addObject("loginInfo","error");
            modelAndView.setViewName("page-login");
        }
        return modelAndView;
    }
}
