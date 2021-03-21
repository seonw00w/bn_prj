package com.bluenight.prj.dao;

import javax.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Mapper;
import com.bluenight.prj.dto.UserDTO;


public interface UserDAO {

	public boolean loginCheck(UserDTO user);

	public UserDTO viewUser(UserDTO user);

	public void logout(HttpSession session);
}
