package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.dto.CheckInfoEntityDto;
import com.bysj.rj.entity.CheckInfoEntity;
import com.bysj.rj.entity.CheckInfoEntityExample;
import com.bysj.rj.service.CheckInfoService;
import com.bysj.rj.util.DateBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/13 0013.
 */
@Controller
public class CheckInfoController extends BaseController{

    @Autowired
    private CheckInfoService checkInfoService;

    @GetMapping("/checkInfoManager")
    public ModelAndView checkInfoView(){
        List<CheckInfoEntity> checkInfoEntities = checkInfoService.getAllCheckInfo();
        List<CheckInfoEntityDto> dtos = new ArrayList<CheckInfoEntityDto>();
        if(!checkInfoEntities.isEmpty()){
            for (CheckInfoEntity entity : checkInfoEntities) {
                CheckInfoEntityDto dto = CheckInfoEntityDto.transDto(entity);
                dtos.add(dto);
            }
        }
        ModelAndView model = new ModelAndView();
        model.addObject("checkInfoList",dtos);
        model.setViewName("checkInfoManager");
        return model;
    }

    @PostMapping("/insertOrUpdateCheckInfo")
    public  ModelAndView insertCheckInfo (CheckInfoEntityDto entityDto){
        CheckInfoEntity entity = CheckInfoEntityDto.transEntity(entityDto);
        logger.info(JSON.toJSONString(entityDto));
        if(null==entityDto.getId()||"".equals(entityDto.getId())){
            //新增操作
            logger.info("新增操作");
            checkInfoService.addNewCheckInfo(entity);
        }else {
            //更新操作
            checkInfoService.updateCheckInfo(entity);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/checkInfoManager");
        return modelAndView;
    }

    @PostMapping(value = "/findCheckInfoById",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String findCheckInfoById(String id){
        CheckInfoEntity entity = checkInfoService.findOneById(Long.parseLong(id));
        CheckInfoEntityDto entityDto = CheckInfoEntityDto.transDto(entity);
        return JSON.toJSONString(entityDto);
    }

    @PostMapping(value = "/deleteCheckInfoById",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String deleteCheckInfoById(String id){
        int count = checkInfoService.deleteCheckInfoById(Long.parseLong(id));
        Map<String,Object> map = new HashMap<String,Object>();
        if(count>0){
            map.put("msg","ok");
        }else {
            map.put("msg","error");
        }
        return JSON.toJSONString(map);
    }

    @PostMapping(value = "/checkInfoFind",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String checkInfoFind(String techType,String startTime,String endTime,
                            String checkResult,String batch){
        if(startTime.equals("")){
            startTime= DateBuilder.formatDate(new Date(0),"yyyy-MM-dd HH:mm:ss");
        }
        if (endTime.equals("")){
            endTime="2055-01-01 00:00:00";
        }
        CheckInfoEntityExample example = new CheckInfoEntityExample();
        CheckInfoEntityExample.Criteria criteria = example.createCriteria();
        if (techType!=""){
            criteria = example.or().andTechTypeEqualTo(techType);
        }
        if (checkResult!=""){
            criteria = criteria.andCheckResultEqualTo(checkResult);
        }
        if (batch!=""){
            criteria = criteria.andBatchEqualTo(batch);
        }
        Date start = DateBuilder.getDate("yyyy-MM-dd HH:mm:ss",startTime);
        Date end = DateBuilder.getDate("yyyy-MM-dd HH:mm:ss",endTime);
        criteria = criteria.andProduceTimeBetween(start,end);
        example.or(criteria);
        example.setOrderByClause("id DESC");
        List<CheckInfoEntity> checkInfoList = checkInfoService.findBySelect(example);
        List<CheckInfoEntityDto> dtos = new ArrayList<CheckInfoEntityDto>();
        if(!checkInfoList.isEmpty()){
            for (CheckInfoEntity entity : checkInfoList) {
                CheckInfoEntityDto dto = CheckInfoEntityDto.transDto(entity);
                dtos.add(dto);
            }
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("checkInfoList",dtos);
        map.put("msg","ok");
        return JSON.toJSONString(map);
    }
}
