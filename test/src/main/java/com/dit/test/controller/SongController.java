package com.dit.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dit.test.domain.SongVO;
import com.dit.test.service.SongService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SongController {
	
	@Autowired
	SongService service;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/")
	public String getSongInfo(Model model) {
		
		List<SongVO> song = service.getSong();
		model.addAttribute("songs", song);
		
		log.info("Song: {}", song);
		
		return "main/main";
	}
	
	
}

