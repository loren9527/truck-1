package com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.bysj.rj.entity.UsersEntity;
import com.bysj.rj.entity.UsersEntityExample;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersEntityMapper {
    int countByExample(UsersEntityExample example);

    int deleteByExample(UsersEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersEntity record);

    int insertSelective(UsersEntity record);

    List<UsersEntity> selectByExample(UsersEntityExample example);

    UsersEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsersEntity record, @Param("example") UsersEntityExample example);

    int updateByExample(@Param("record") UsersEntity record, @Param("example") UsersEntityExample example);

    int updateByPrimaryKeySelective(UsersEntity record);

    int updateByPrimaryKey(UsersEntity record);
}