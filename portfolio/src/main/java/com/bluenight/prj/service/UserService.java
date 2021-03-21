package com.bluenight.prj.service;

import javax.servlet.http.HttpSession;

import com.bluenight.prj.dto.UserDTO;

public interface UserService {

	 public boolean loginCheck(UserDTO user, HttpSession session);
	 
	 public UserDTO viewUser(UserDTO user);
	 
	 public void logout(HttpSession session);
}
