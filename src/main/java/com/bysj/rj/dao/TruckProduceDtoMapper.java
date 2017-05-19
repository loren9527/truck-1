package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.TruckProduceDto;
import com.bysj.rj.entity.TruckProduceDtoExample;

public interface TruckProduceDtoMapper {
    int countByExample(TruckProduceDtoExample example);

    int deleteByExample(TruckProduceDtoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TruckProduceDto record);

    int insertBatch(List<TruckProduceDto> truckProduceDtoList);

    int insertSelective(TruckProduceDto record);

    List<TruckProduceDto> selectByExample(TruckProduceDtoExample example);

    TruckProduceDto selectTypeUpOne(String type);

    TruckProduceDto selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TruckProduceDto record, @Param("example") TruckProduceDtoExample example);

    int updateByExample(@Param("record") TruckProduceDto record, @Param("example") TruckProduceDtoExample example);

    int updateByPrimaryKeySelective(TruckProduceDto record);

    int updateByPrimaryKey(TruckProduceDto record);
}