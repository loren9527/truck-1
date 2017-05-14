package com.bysj.rj.service;

import com.alibaba.fastjson.JSONObject;
import com.bysj.rj.dao.TruckEntityMapper;
import com.bysj.rj.entity.TruckEntityExample;
import com.bysj.rj.util.ConstantString;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 龙 on 2017/5/13.
 */
@Repository
public class TruckService {
    @Resource
    private TruckEntityMapper truckEntityMapper;

    public void fillEchartData(JSONObject resultJSON) {
        TruckEntityExample goodCountExample=new TruckEntityExample();
        goodCountExample.or().andStateEqualTo((byte)1);   //0代表次品 1成品 2正在生产
       int allGoodCount= truckEntityMapper.countByExample(goodCountExample);

        TruckEntityExample badCountExample=new TruckEntityExample();
        goodCountExample.or().andStateEqualTo((byte)0);
        int allBadCount= truckEntityMapper.countByExample(badCountExample);

        TruckEntityExample example1 =new TruckEntityExample();
        example1.or().andTypeEqualTo(ConstantString.TYPE_CRH3_TRUCK);
        int typeCRH3_Count= truckEntityMapper.countByExample(badCountExample);

        TruckEntityExample example2=new TruckEntityExample();
        example2.or().andTypeEqualTo(ConstantString.TYPE_ABCSubway_TRUCK);
        int typeABCSubway_Count= truckEntityMapper.countByExample(badCountExample);

        TruckEntityExample example3=new TruckEntityExample();
        example3.or().andTypeEqualTo(ConstantString.TYPE_SW220K_TRUCK);
        int typeSW220K_Count= truckEntityMapper.countByExample(badCountExample);

        resultJSON.put("allGoodCount",allGoodCount);
        resultJSON.put("allBadCount",allBadCount);
        resultJSON.put("typeCRH3_Count",typeCRH3_Count);
        resultJSON.put("typeABCSubway_Count",typeABCSubway_Count);
        resultJSON.put("typeSW220K_Count",typeSW220K_Count);

    }

    public void fillGoodOrBad(JSONObject resultJSON ,String type) {
        TruckEntityExample goodCountExample=new TruckEntityExample();
        goodCountExample.or().andStateEqualTo((byte)1).andTypeEqualTo(type);   //0代表次品 1成品 2正在生产
        int allGoodCount= truckEntityMapper.countByExample(goodCountExample);

        TruckEntityExample badCountExample=new TruckEntityExample();
        goodCountExample.or().andStateEqualTo((byte)0).andTypeEqualTo(type);
        int allBadCount= truckEntityMapper.countByExample(badCountExample);

        resultJSON.put("allGoodCount",allGoodCount);
        resultJSON.put("allBadCount",allBadCount);
    }

    public void initTruckSelect(JSONObject resultJSON) {


    }
}
