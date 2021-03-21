package com.bluenight.prj.dto;

import java.time.LocalDateTime;

public class UserDTO {

	private int user_no;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_photo; // 자료형 애들과 협의 필요
	private int user_status; // 0: 탈퇴, 1: 이용중
	private LocalDateTime user_join_datetime; // 가입일
	private LocalDateTime user_lastlogin_datetime; // 최종 로그인 날짜
	private int user_is_manager; // 0: 일반 유저, 1: 관리자
	private String user_email;

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_photo() {
		return user_photo;
	}

	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}

	public int getUser_status() {
		return user_status;
	}

	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}

	public LocalDateTime getUser_join_datetime() {
		return user_join_datetime;
	}

	public void setUser_join_datetime(LocalDateTime user_join_datetime) {
		this.user_join_datetime = user_join_datetime;
	}

	public LocalDateTime getUser_lastlogin_datetime() {
		return user_lastlogin_datetime;
	}

	public void setUser_lastlogin_datetime(LocalDateTime user_lastlogin_datetime) {
		this.user_lastlogin_datetime = user_lastlogin_datetime;
	}

	public int getUser_is_manager() {
		return user_is_manager;
	}

	public void setUser_is_manager(int user_is_manager) {
		this.user_is_manager = user_is_manager;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

}
