package com.cicms.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cicms.mapper.UserMapper;
import com.cicms.pojo.User;
import com.cicms.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		User user1 = userMapper.selectByNameAndPwd(user);
		return user1;
	}

}
