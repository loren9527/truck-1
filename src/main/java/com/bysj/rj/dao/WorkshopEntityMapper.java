package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.WorkshopEntity;
import com.bysj.rj.entity.WorkshopEntityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopEntityMapper {
    int countByExample(WorkshopEntityExample example);

    int deleteByExample(WorkshopEntityExample example);

    int deleteByPrimaryKey(Integer workId);

    int insert(WorkshopEntity record);

    int insertSelective(WorkshopEntity record);

    List<WorkshopEntity> selectByExample(WorkshopEntityExample example);

    WorkshopEntity selectByPrimaryKey(Integer workId);

    int updateByExampleSelective(@Param("record") WorkshopEntity record, @Param("example") WorkshopEntityExample example);

    int updateByExample(@Param("record") WorkshopEntity record, @Param("example") WorkshopEntityExample example);

    int updateByPrimaryKeySelective(WorkshopEntity record);

    int updateByPrimaryKey(WorkshopEntity record);
}