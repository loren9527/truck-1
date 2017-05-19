package com.bysj.rj.service;

import com.bysj.rj.dao.UsersEntityMapper;
import com.bysj.rj.entity.UsersEntity;
import com.bysj.rj.entity.UsersEntityExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/10 0010.
 */
@Service
public class UserService {
    @Resource
    private UsersEntityMapper userEntityMapper;

    /**
     * 账号注册
     * @param entity
     * @return
     */
    public int registerAccount(UsersEntity entity){
        return userEntityMapper.insertSelective(entity);
    }

    /**
     * 登录校验
     * @param user
     * @return
     */
    public UsersEntity loginCheck(UsersEntity user){
        UsersEntityExample userEntityExample = new UsersEntityExample();
        //组装查询条件
        userEntityExample.or()
            .andUserAccountEqualTo(user.getUserAccount())
            .andPasswordEqualTo(user.getPassword());
        ArrayList<UsersEntity> list = new ArrayList<UsersEntity>();
        list.isEmpty();
        List<UsersEntity> userEntityList = userEntityMapper.selectByExample(userEntityExample);
        if(!userEntityList.isEmpty()){
            return userEntityList.get(0);
        }else{
            return null;
        }
    }
}
