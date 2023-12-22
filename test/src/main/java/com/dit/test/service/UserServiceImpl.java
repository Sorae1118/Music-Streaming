package com.dit.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dit.test.domain.UserVO;
import com.dit.test.mapper.UserMapper;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;

	@Override
	public void doRegister(UserVO user) {
		
		mapper.register(user);
	}

	@Override
	public UserVO getUserInfo(String email, String password) {

		UserVO user = mapper.getUserInfo(email, password);
		
		return user;
        
	}
	
	
}
