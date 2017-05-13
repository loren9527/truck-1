package com.bysj.rj.service;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.dao.PartsEntityMapper;
import com.bysj.rj.dto.PartsEntityDto;
import com.bysj.rj.entity.PartsEntity;
import com.bysj.rj.entity.PartsEntityExample;
import com.bysj.rj.util.DateBuilder;
import org.apache.log4j.Logger;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/9 0009.
 */
@Service
public class PartsService {
    private Logger logger = Logger.getLogger(PartsService.class);
    @Resource
    private PartsEntityMapper partsEntityMapper;

    /**
     * 批量保存配件
     * @param parts
     */
    public void saveAllParts(ArrayList<Map<String,Object>> parts){
        for (Map<String, Object> part : parts) {
            PartsEntityDto dto = new PartsEntityDto();
            dto = mapToBean(part,dto);
            dto.setCreateTime(DateBuilder.formatDate(new Date(),DateBuilder.YYYY_MM_DD_HH_mm_ss));
            PartsEntity entity = PartsEntityDto.transEntity(dto);
            partsEntityMapper.insert(entity);
            System.out.println(JSON.toJSONString(entity));
        }
    }

    /**
     * 单条插入
     * @param partsEntity
     * @return
     */
    public int addNewPart(PartsEntity partsEntity){
        partsEntity.setCreateTime(new Date());
        int count = partsEntityMapper.insertSelective(partsEntity);
        return count;
    }

    public int updatePart(PartsEntity entity){
        return partsEntityMapper.updateByPrimaryKeySelective(entity);
    }
    /**
     * 查询配件信息
     * @return
     */
    public List<PartsEntity> getAllParts(){
        PartsEntityExample example = new PartsEntityExample();
        example.setOrderByClause("id DESC");
        return partsEntityMapper.selectByExample(example);
    }

    /**
     * 按条件查询
     * @param example
     * @return
     */
    public List<PartsEntity> findBySelect(PartsEntityExample example){
        return partsEntityMapper.selectByExample(example);
    }

    public static <T> T mapToBean(Map<String, Object> map,T bean) {
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    public PartsEntity findOneById(Integer id){
        return partsEntityMapper.selectByPrimaryKey(id);
    }

    public int deletePartById(Integer id){
        return partsEntityMapper.deleteByPrimaryKey(id);
    }
}
