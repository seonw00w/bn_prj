package com.bluenight.prj.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bluenight.prj.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public boolean loginCheck(UserDTO user) {
		String isUser = sqlSession.selectOne("user.loginCheck", user);
		return (isUser == null) ? false : true;
	}
	
	@Override
	public UserDTO viewUser(UserDTO user) {
		return sqlSession.selectOne("user.viewUser", user);
	}
	
	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		
	}
}


