package com.bluenight.prj.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluenight.prj.dao.UserDAO;
import com.bluenight.prj.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;

	public boolean loginCheck(UserDTO user, HttpSession session) {
		boolean result = userDao.loginCheck(user);
		if(result) {
			UserDTO user_info = viewUser(user);
			
			session.setAttribute("userId", user_info.getUser_id());
			session.setAttribute("userName", user_info.getUser_name());
		}
		return result;
	}
	
	@Override
	public UserDTO viewUser(UserDTO user) {
		return userDao.viewUser(user);
	}
	
	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
