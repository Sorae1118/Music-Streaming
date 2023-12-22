package com.dit.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dit.test.mapper.BoardMapper;

@Component
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public int getTotalCount() {
		
		return mapper.getTotal() ;
	}

}
