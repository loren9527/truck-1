package com.bysj.rj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class PartsController extends BaseController{


    @GetMapping("/willDoPlan")
    public ModelAndView willDoPlan(){
        ModelAndView model = new ModelAndView();
        model.setViewName("willDoPlan");
        return model;
    }

}
