package com.bysj.rj.dao;

import com.bysj.rj.entity.PartsEntity;
import com.bysj.rj.entity.PartsEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PartsEntityMapper {
    int countByExample(PartsEntityExample example);

    int deleteByExample(PartsEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartsEntity record);

    int insertSelective(PartsEntity record);

    List<PartsEntity> selectByExample(PartsEntityExample example);

    PartsEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartsEntity record, @Param("example") PartsEntityExample example);

    int updateByExample(@Param("record") PartsEntity record, @Param("example") PartsEntityExample example);

    int updateByPrimaryKeySelective(PartsEntity record);

    int updateByPrimaryKey(PartsEntity record);
}