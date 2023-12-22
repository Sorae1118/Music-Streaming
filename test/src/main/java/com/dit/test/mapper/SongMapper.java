package com.dit.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dit.test.domain.SongVO;

@Mapper
public interface SongMapper {
	
	public List<SongVO> getSong();
	
}
