package com.clouds.igankong.services;

import com.clouds.igankong.po.User;

public interface LoginService {
	//检查是否存在该用户，并返回该用户信息
	public User checkLogin(String userid) throws Exception;
}
