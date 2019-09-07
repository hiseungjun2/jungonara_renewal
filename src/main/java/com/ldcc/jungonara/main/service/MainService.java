package com.ldcc.jungonara.main.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

public interface MainService {
	
	/*
	 * 회원 로그인
	 */
	public int userLogin(HttpServletRequest request) throws Exception;
}
