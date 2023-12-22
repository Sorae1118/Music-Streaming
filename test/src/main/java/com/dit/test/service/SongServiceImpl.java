package com.dit.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dit.test.domain.SongVO;
import com.dit.test.mapper.SongMapper;

@Component
public class SongServiceImpl implements SongService{
	
	@Autowired
	private SongMapper mapper;

	@Override
	public List<SongVO> getSong() {
		
		return mapper.getSong();
	}
	
	
}
