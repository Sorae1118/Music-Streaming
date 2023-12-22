package com.dit.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dit.test.domain.UserVO;
import com.dit.test.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("user/*")
@Slf4j
public class UserController {
	
	@Autowired
	UserService service;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/register")
	public void doRegister() {
		
	}
	
	@PostMapping("/register")
	public String doRegister(UserVO user, RedirectAttributes rttr) {
		service.doRegister(user);
		
		log.info(user.getEmail());
		log.info(user.getUsername());
		log.info(user.getPassword());
		log.info(user.getPhone());
		
		rttr.addFlashAttribute("result", "registered");
		
		return "redirect:/user/login";
	}
	
	@GetMapping("/login")
	public void userLogin() {
		
	}
	
	@PostMapping("/login")
	public String doLogin(@RequestParam String email, @RequestParam String password,
			Model model, HttpSession session) {
		
		UserVO user = service.getUserInfo(email, password);
		
		if (user != null) {
			model.addAttribute("loginsuccess","로그인 성공");
			session.setAttribute("loggedInUser", user);
			
			return "redirect:/";
		} else {
			model.addAttribute("loginError", "아이디 또는 비밀번호가 일치하지 않습니다.");
			
			return "redirect:/user/login";
		}
		
		
	}
	
}
