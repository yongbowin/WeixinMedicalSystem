package com.clouds.igankong.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.clouds.igankong.mapper.UserMapper;
import com.clouds.igankong.po.User;
import com.clouds.igankong.po.UserExample;
import com.clouds.igankong.services.LoginService;

public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User checkLogin(String userid) throws Exception {
		System.out.println("进入LoginServiceImpl方法..................");
		
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		
		criteria.andUseridEqualTo(userid);
		// 判断数据库中当前用户是否已登记
		List<User> userList = userMapper.selectByExample(userExample);	
		if (userList.size() > 0) {
			return userList.get(0);
		}
		else {
			return null;
		}
	}
}
