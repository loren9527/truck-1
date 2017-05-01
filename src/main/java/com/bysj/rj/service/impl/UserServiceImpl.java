package com.bysj.rj.service.impl;


import com.bysj.rj.dao.IUserDao;
import com.bysj.rj.entity.User;
import com.bysj.rj.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
