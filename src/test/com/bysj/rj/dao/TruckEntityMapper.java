package test.com.bysj.rj.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.com.bysj.rj.entity.TruckEntity;
import test.com.bysj.rj.entity.TruckEntityExample;

public interface TruckEntityMapper {
    int countByExample(TruckEntityExample example);

    int deleteByExample(TruckEntityExample example);

    int deleteByPrimaryKey(Long truckId);

    int insert(TruckEntity record);

    int insertSelective(TruckEntity record);

    List<TruckEntity> selectByExample(TruckEntityExample example);

    TruckEntity selectByPrimaryKey(Long truckId);

    int updateByExampleSelective(@Param("record") TruckEntity record, @Param("example") TruckEntityExample example);

    int updateByExample(@Param("record") TruckEntity record, @Param("example") TruckEntityExample example);

    int updateByPrimaryKeySelective(TruckEntity record);

    int updateByPrimaryKey(TruckEntity record);
}