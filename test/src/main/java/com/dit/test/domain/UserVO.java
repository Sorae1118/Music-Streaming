package com.dit.test.domain;

import lombok.Data;

@Data
public class UserVO {
	private int id;
	private String email;
	private String username;
	private String password;
	private String phone;
}
