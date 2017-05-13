package com.bysj.rj.service;

import com.bysj.rj.dao.UserEntityMapper;
import com.bysj.rj.entity.UserEntity;
import com.bysj.rj.entity.UserEntityExample;
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
    private UserEntityMapper userEntityMapper;

    /**
     * 账号注册
     * @param entity
     * @return
     */
    public int registerAccount(UserEntity entity){
        return userEntityMapper.insertSelective(entity);
    }

    /**
     * 登录校验
     * @param user
     * @return
     */
    public UserEntity loginCheck(UserEntity user){
        UserEntityExample userEntityExample = new UserEntityExample();
        //组装查询条件
        userEntityExample.or()
            .andUserAccountEqualTo(user.getUserAccount())
            .andPasswordEqualTo(user.getPassword());
        ArrayList<UserEntity> list = new ArrayList<UserEntity>();
        list.isEmpty();
        List<UserEntity> userEntityList = userEntityMapper.selectByExample(userEntityExample);
        if(!userEntityList.isEmpty()){
            return userEntityList.get(0);
        }else{
            return null;
        }
    }
}
