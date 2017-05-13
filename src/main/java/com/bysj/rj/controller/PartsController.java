package com.bysj.rj.controller;


import com.alibaba.fastjson.JSON;
import com.bysj.rj.dto.PartsEntityDto;
import com.bysj.rj.entity.PartsEntity;
import com.bysj.rj.entity.PartsEntityExample;
import com.bysj.rj.interceptor.LoginFilter;
import com.bysj.rj.service.PartsService;
import com.bysj.rj.util.DateBuilder;
import com.bysj.rj.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PartsController extends BaseController{

    @Autowired
    private PartsService partsService;

    @GetMapping("/partsList")
    @LoginFilter(value = "user1")
    public String partsView(){
        ModelAndView model = new ModelAndView();
        model.setViewName("partsList");
        return "partsList";
    }

    @PostMapping("/uploadExcel")
    public ModelAndView uploadExcel(@RequestParam("filed") CommonsMultipartFile file) throws IOException {
        InputStream is = file.getInputStream();
        logger.info(file.getOriginalFilename()+"----");
        ArrayList<Map<String,Object>> partsList = ExcelUtil.readExcelToObj(is);
        logger.info(JSON.toJSON(partsList));
        ModelAndView model = new ModelAndView();
        request.getSession().setAttribute("parts",partsList);
        model.addObject("partsList",JSON.toJSON(partsList));
        model.setViewName("partsList");
        return model;
    }

    @PostMapping("/insertParts")
    public String insertParts() throws Exception{
        ArrayList<Map<String,Object>> partsList = (ArrayList<Map<String,Object>>)request.getSession().getAttribute("parts");
        logger.info(partsList+"前台获取");
        partsService.saveAllParts(partsList);
        return "redirect:/partManager";
    }

    @GetMapping("/partManager")
    @LoginFilter
    public ModelAndView partManager(){

        List<PartsEntity> partsList = partsService.getAllParts();
        List<PartsEntityDto> dtos = new ArrayList<PartsEntityDto>();
        if(!partsList.isEmpty()){
            for (PartsEntity entity : partsList) {
                PartsEntityDto dto = PartsEntityDto.transDto(entity);
                dtos.add(dto);
            }
        }
        ModelAndView model = new ModelAndView();
        model.addObject("partsList",dtos);
        model.setViewName("partManager");
        return model;
    }

    @GetMapping("/ioRecord")
    public ModelAndView ioRecord(){
        ModelAndView model = new ModelAndView();
        model.setViewName("ioRecord");
        return model;
    }

    @PostMapping(value = "/partsFind",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String partsFind(String serialNum,String startTime,String endTime,
                          String partName,String businessName){
        if(startTime.equals("")){
            startTime=DateBuilder.formatDate(new Date(0),"yyyy-MM-dd");
        }
        if (endTime.equals("")){
            endTime="2055-01-01";
        }
        PartsEntityExample example = new PartsEntityExample();
        PartsEntityExample.Criteria criteria = example.createCriteria();
        if (serialNum!=""){
            criteria = example.or().andSerialNumEqualTo(serialNum);
        }
        if (partName!=""){
            criteria = criteria.andPartNameEqualTo(partName);
        }
        if (businessName!=""){
            criteria = criteria.andBusinessNameEqualTo(businessName);
        }
        Date start = DateBuilder.getDate("yyyy-MM-dd",startTime);
        Date end = DateBuilder.getDate("yyyy-MM-dd",endTime);
        criteria = criteria.andProduceTimeBetween(start,end);
        example.or(criteria);
        example.setOrderByClause("create_time DESC");
        List<PartsEntity> partsList = partsService.findBySelect(example);
        List<PartsEntityDto> dtos = new ArrayList<PartsEntityDto>();
        if(!partsList.isEmpty()){
            for (PartsEntity entity : partsList) {
                PartsEntityDto dto = PartsEntityDto.transDto(entity);
                dtos.add(dto);
            }
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("partsList",dtos);
        map.put("msg","ok");
        response.setContentType("application/json;charset=utf-8");
        return JSON.toJSONString(map);
    }

    @PostMapping("/insertOrUpdatePart")
    public  ModelAndView insertPart (PartsEntityDto entityDto){
        PartsEntity entity = PartsEntityDto.transEntity(entityDto);
        logger.info(JSON.toJSONString(entityDto));
        if(null==entityDto.getId()||"".equals(entityDto.getId())){
            //新增操作
            logger.info("新增操作");
            partsService.addNewPart(entity);
        }else {
            //更新操作
            partsService.updatePart(entity);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/partManager");
        return modelAndView;
    }

    @PostMapping(value = "/findPartById",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String findPartById(String id){
        PartsEntity entity = partsService.findOneById(Integer.parseInt(id));
        PartsEntityDto entityDto = PartsEntityDto.transDto(entity);
        return JSON.toJSONString(entityDto);
    }

    @PostMapping(value = "/deletePartById",produces = "application/json;charset=UTF-8;")
    @ResponseBody
    public String deletePartById(String id){
        int count = partsService.deletePartById(Integer.parseInt(id));
        Map<String,Object> map = new HashMap<String,Object>();
        if(count>0){
            map.put("msg","ok");
        }else {
            map.put("msg","error");
        }
        return JSON.toJSONString(map);
    }

}
