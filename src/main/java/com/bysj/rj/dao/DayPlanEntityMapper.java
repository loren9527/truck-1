package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.DayPlanEntity;
import com.bysj.rj.entity.DayPlanEntityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface DayPlanEntityMapper {
    int countByExample(DayPlanEntityExample example);

    int deleteByExample(DayPlanEntityExample example);

    int deleteByPrimaryKey(Long dpId);

    int insert(DayPlanEntity record);

    int insertBatch(List<DayPlanEntity> dayPlanEntityList);

    int insertSelective(DayPlanEntity record);

    List<DayPlanEntity> selectByExample(DayPlanEntityExample example);

    DayPlanEntity selectByPrimaryKey(Long dpId);

    int updateByExampleSelective(@Param("record") DayPlanEntity record, @Param("example") DayPlanEntityExample example);

    int updateByExample(@Param("record") DayPlanEntity record, @Param("example") DayPlanEntityExample example);

    int updateByPrimaryKeySelective(DayPlanEntity record);

    int updateByPrimaryKey(DayPlanEntity record);
}