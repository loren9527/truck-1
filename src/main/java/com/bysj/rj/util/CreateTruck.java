package com.bysj.rj.util;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.entity.TruckEntity;
import com.bysj.rj.entity.TruckProduceDto;
import com.bysj.rj.service.TruckProduceDtoScervice;
import com.bysj.rj.service.TruckService;
import com.bysj.rj.service.WorkshopService;
import com.bysj.rj.websocket.WebsocketHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

/**
 * Created by 龙 on 2017/5/18.
 */
@Component
public class CreateTruck implements Runnable {

    @Resource
    private WebsocketHandler websocketHandler;
    @Resource
    private TruckProduceDtoScervice produceDtoScervice;
    @Resource
    private TruckService truckService;
    @Resource
    private WorkshopService workshopService;

    public void run() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("hh:mm:ss");

        Random random=new Random();
        TruckProduceDto temp= produceDtoScervice.getTypeUpOne(ConstantString.TYPE_ABCSubway_TRUCK);
        ConstantString.truckTestId=temp.getId();
        List<TruckProduceDto > listABCSubway =produceDtoScervice.getABCSubway_TRUCK_All(ConstantString.truckTestId,9+ConstantString.truckTestId);
        while (listABCSubway!=null){
            ConstantString.truckTestId= ConstantString.truckTestId+9;
            for (int i=0;i<listABCSubway.size();i++){
                try {
                    websocketHandler.sendMessages(JSON.toJSONString(listABCSubway.get(i)));
                    TruckEntity truckEntity=new TruckEntity();
                    workshopService.createTruck(truckEntity);
                    if(random.nextInt(12)==11){
                        truckEntity.setState((byte)0);  //设置为次品
                    }else {
                        truckEntity.setState((byte)1);  //设置为次品
                    }

                    truckService.createTruckEntity(truckEntity);
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            listABCSubway =produceDtoScervice.getABCSubway_TRUCK_All(ConstantString.truckTestId,9+ConstantString.truckTestId);
        }
    }
}
