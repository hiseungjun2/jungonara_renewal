package com.ldcc.jungonara.main.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldcc.jungonara.common.mybatis.CommonDao;
import com.ldcc.jungonara.main.service.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService {

	
	private CommonDao commonDao; 
	
//	@Autowired
//	private SqlSessionTemplate sqlSession;
	
	/*
	 * 회원 로그인
	 */
	public int userLogin(HttpServletRequest request) throws Exception {
	
		int success = 0;
		
		Map<String, Object> infoMap = new HashMap<String, Object>();
		
		infoMap.put("USER_ID", request.getParameter("USER_ID"));	
		infoMap.put("PASSWORD", request.getParameter("PASSWORD"));
		
		System.out.println(infoMap.toString());
		
		List<Map<String, Object>> result = commonDao.selectList("main.selectUser", infoMap);
		
		System.out.println(result.toString());
		return success;
	}
	
}
