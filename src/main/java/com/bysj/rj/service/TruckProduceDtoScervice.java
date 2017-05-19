package com.bysj.rj.service;

import com.bysj.rj.dao.TruckProduceDtoMapper;
import com.bysj.rj.entity.TruckProduceDto;
import com.bysj.rj.entity.TruckProduceDtoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 龙 on 2017/5/17.
 */
@Service
public class TruckProduceDtoScervice {
    @Resource
    private TruckProduceDtoMapper truckProduceDtoMapper;

    public void insert(TruckProduceDto truckProduceDto) {
        truckProduceDtoMapper.insert(truckProduceDto);
    }

    public void insertBatch(List<TruckProduceDto> truckProduceDtoList) {
        truckProduceDtoMapper.insertBatch(truckProduceDtoList);
    }

    public  TruckProduceDto getTypeUpOne(String type){
        return truckProduceDtoMapper.selectTypeUpOne(type);
    }
    public List<TruckProduceDto> getCRH3_TRUCK_All(Long down,Long up) {
        TruckProduceDtoExample example=new TruckProduceDtoExample();
        example.or().andIdBetween(down,up);
        return truckProduceDtoMapper.selectByExample(example);
    }



    public List<TruckProduceDto> getABCSubway_TRUCK_All(Long down,Long up) {
        TruckProduceDtoExample example=new TruckProduceDtoExample();
        example.or().andIdBetween(down,up);
        return truckProduceDtoMapper.selectByExample(example);
    }

    public void getSW220K_TRUCK_All() {
    }
}
