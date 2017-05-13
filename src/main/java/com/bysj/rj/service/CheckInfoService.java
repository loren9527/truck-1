package com.bysj.rj.service;

import com.bysj.rj.dao.CheckInfoEntityMapper;
import com.bysj.rj.entity.CheckInfoEntity;
import com.bysj.rj.entity.CheckInfoEntityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/13 0013.
 */
@Service
public class CheckInfoService {
    @Resource
    private CheckInfoEntityMapper checkInfoEntityMapper;

    /**
     * 查找所有检查信息
     * @return
     */
    public List<CheckInfoEntity> getAllCheckInfo(){
        CheckInfoEntityExample example = new CheckInfoEntityExample();
        example.setOrderByClause("id DESC");
        return checkInfoEntityMapper.selectByExample(example);
    }

    /**
     * 单条插入
     * @param checkInfoEntity
     * @return
     */
    public int addNewCheckInfo(CheckInfoEntity checkInfoEntity){
        int count = checkInfoEntityMapper.insertSelective(checkInfoEntity);
        return count;
    }

    /**
     * 更新
     * @param entity
     * @return
     */
    public int updateCheckInfo(CheckInfoEntity entity){
        return checkInfoEntityMapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    public CheckInfoEntity findOneById(Long id){
        return checkInfoEntityMapper.selectByPrimaryKey(id);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteCheckInfoById(Long id){
        return checkInfoEntityMapper.deleteByPrimaryKey(id);
    }

    /**
     * 条件查询
     * @param example
     * @return
     */
    public List<CheckInfoEntity> findBySelect(CheckInfoEntityExample example){
        return checkInfoEntityMapper.selectByExample(example);
    }
}
