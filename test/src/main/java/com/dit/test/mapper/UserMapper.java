package com.dit.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dit.test.domain.UserVO;

@Mapper
public interface UserMapper {
	
	public void register(UserVO user);
	
	public UserVO getUserInfo(@Param("email") String email, @Param("password") String password);
	
}
