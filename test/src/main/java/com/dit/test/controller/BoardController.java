package com.dit.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dit.test.service.BoardService;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("board/*")
@Slf4j
public class BoardController {
	
	@Autowired
	BoardService service;
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	@GetMapping("/welcome")
	public void test(Model model) {
		String value = String.valueOf(service.getTotalCount());
		log.info(value); 
		model.addAttribute("test", value);
	}
	
	@GetMapping("/test")
	public void thymeleafTest() {
		
	}
}