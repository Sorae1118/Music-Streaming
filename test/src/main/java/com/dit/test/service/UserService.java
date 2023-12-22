package com.dit.test.service;

import com.dit.test.domain.UserVO;

public interface UserService {
	
	public void doRegister(UserVO user);
	
	public UserVO getUserInfo(String email, String password);
}
