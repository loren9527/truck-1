package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.TruckPlanEntity;
import com.bysj.rj.entity.TruckPlanEntityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckPlanEntityMapper {
    int countByExample(TruckPlanEntityExample example);

    int deleteByExample(TruckPlanEntityExample example);

    int deleteByPrimaryKey(Long planId);

    int insert(TruckPlanEntity record);

    int insertSelective(TruckPlanEntity record);

    List<TruckPlanEntity> selectByExample(TruckPlanEntityExample example);

    TruckPlanEntity selectByPrimaryKey(Long planId);

    int updateByExampleSelective(@Param("record") TruckPlanEntity record, @Param("example") TruckPlanEntityExample example);

    int updateByExample(@Param("record") TruckPlanEntity record, @Param("example") TruckPlanEntityExample example);

    int updateByPrimaryKeySelective(TruckPlanEntity record);

    int updateByPrimaryKey(TruckPlanEntity record);
}