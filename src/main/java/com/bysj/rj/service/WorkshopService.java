package com.bysj.rj.service;

import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.dao.WorkshopEntityMapper;
import com.bysj.rj.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 龙 on 2017/5/13.
 */
@Service
public class WorkshopService {
    @Resource
    private WorkshopEntityMapper workshopEntityMapper;
@Resource
private DayPlanService dayPlanService;
    @Resource
    private TruckPlanService truckPlanService;
    @Resource
    private PartsService partsService;

    public List<WorkshopEntity> canWorkEntity() {
        WorkshopEntityExample example=new WorkshopEntityExample();
        example.or().andHealthEqualTo((byte)1).//1代表健康  0代表坏了
                andWorkStateEqualTo((byte)1); //1代表空闲  0代表正在工作
        return workshopEntityMapper.selectByExample(example);
    }

    public int doDayPlan(String dayPlanId, String workshopName) {
       WorkshopEntity workshopEntity=new WorkshopEntity();
        workshopEntity.setDpId(Long.parseLong(dayPlanId));
        workshopEntity.setWorkState((byte)0);
        WorkshopEntityExample example=new WorkshopEntityExample();
        example.or().andNameEqualTo(workshopName);

        int result= workshopEntityMapper.updateByExampleSelective(workshopEntity,example);
        if (result>0){
            int deletVoluem=dayPlanService.getEntiyByDpID(Long.parseLong(dayPlanId)).getPlanVolume();
//            partsService.deleStock(deletVoluem); //在这里把库存的配件减少  并要增加一条出库记录

        }

        return result;
    }

    public List<WorkshopEntity> getWorkshopList() {
        WorkshopEntityExample example=new WorkshopEntityExample();
        return workshopEntityMapper.selectByExample(example);
    }

    public void initWorkshop(JSONObject resultJSON) {
        List<WorkshopEntity> workshopEntityList= getWorkshopList();
       for (int i=0;i<workshopEntityList.size();i++){
           if(workshopEntityList.get(i).getDpId()==null) continue;
           DayPlanEntity dayPlanEntity= dayPlanService.getEntiyByDpID(workshopEntityList.get(i).getDpId());
           if(dayPlanEntity==null) continue;
           TruckPlanEntity truckPlanEntity=truckPlanService.getEntityById(dayPlanEntity.getTruckPlanId());
           resultJSON.put("workshop"+i,workshopEntityList.get(i));
           resultJSON.put("truckPlanNumber"+i,truckPlanEntity.getPlanNumber());
           resultJSON.put("truckType"+i,truckPlanEntity.getTruckType());
           resultJSON.put("dayPlanDate"+i,dayPlanEntity.getStrDate());
       }
    }

    public void createTruck(TruckEntity truckEntity)  {
        SimpleDateFormat dateFormat=new  SimpleDateFormat("yyyy-MM-dd");
        JSONObject resultJSON=new JSONObject();
        initWorkshop(resultJSON);
        truckEntity.setBatch(resultJSON.getString("truckPlanNumber0"));
        truckEntity.setType(resultJSON.getString("truckType0"));
        truckEntity.setDpId(Long.parseLong(resultJSON.getJSONObject("workshop0").getString("dpId")));
        try {
            truckEntity.setDate(dateFormat.parse(resultJSON.getString("dayPlanDate")).getTime());
        } catch (ParseException e) {
            truckEntity.setDate(System.currentTimeMillis()/1000);
        }catch (NullPointerException e) {
            truckEntity.setDate(System.currentTimeMillis()/1000);
        }
    }
}
