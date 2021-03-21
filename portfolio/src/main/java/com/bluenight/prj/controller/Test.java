package com.bluenight.prj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bluenight.prj.dto.UserDTO;
import com.bluenight.prj.service.UserService;

@Controller
public class Test {
	@Autowired
	UserService userService;

	@GetMapping("test")
	public String show(Model model) {
		return "test";
	}

	@GetMapping("login")
	public String signin(Model model) {
		return "login";
	}

	@PostMapping("loginCheck")
	public void signProcess(UserDTO user, HttpSession session) {
		boolean result = userService.loginCheck(user, session); 
		if(result == true) {
			System.out.println("회원 있음");
		}
		else {
			System.out.println("회원 없다");
		}
	}

	@GetMapping("DBtest")
	public void dbtest(UserDTO user) {
		UserDTO user_info = userService.viewUser(user);
		System.out.println(user_info.getUser_no());
		System.out.println(user_info.getUser_id());
		System.out.println(user_info.getUser_pw());
		System.out.println(user_info.getUser_name());
		System.out.println(user_info.getUser_status());
		System.out.println(user_info.getUser_join_datetime());
		System.out.println(user_info.getUser_lastlogin_datetime());
	}
}
