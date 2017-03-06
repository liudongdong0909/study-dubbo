package com.donggua.dubbo.service;

import com.donggua.dubbo.bean.User;

import java.util.List;


public interface UserService {

	/**
	 * 查询所有的用户数据
	 * 
	 * @return
	 */
	public List<User> queryAll();

}