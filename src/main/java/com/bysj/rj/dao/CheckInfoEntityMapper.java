package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.CheckInfoEntity;
import com.bysj.rj.entity.CheckInfoEntityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInfoEntityMapper {
    int countByExample(CheckInfoEntityExample example);

    int deleteByExample(CheckInfoEntityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckInfoEntity record);

    int insertSelective(CheckInfoEntity record);

    List<CheckInfoEntity> selectByExample(CheckInfoEntityExample example);

    CheckInfoEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckInfoEntity record, @Param("example") CheckInfoEntityExample example);

    int updateByExample(@Param("record") CheckInfoEntity record, @Param("example") CheckInfoEntityExample example);

    int updateByPrimaryKeySelective(CheckInfoEntity record);

    int updateByPrimaryKey(CheckInfoEntity record);
}