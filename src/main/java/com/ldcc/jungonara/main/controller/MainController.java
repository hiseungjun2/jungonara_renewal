package com.ldcc.jungonara.main.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.ldcc.jungonara.main.service.MainService;

/*
 * 메인 화면 컨트롤
 */
@Controller
public class MainController {
	
	@Resource(name="mainService")
	private MainService mainService;
	
	/*
	 * 로그인 화면
	 */
	@RequestMapping(value="/main")
	public ModelAndView viewMain() {
	
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("main/login");
		
		return mv;
	}
	
	/*
	 * 회원가입 화면
	 */
	@RequestMapping(value="/main/join", method = RequestMethod.GET)
	public ModelAndView viewJoin() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("main/join");
		
		return mv;
	}
	
	/*
	 * 회원 로그
	 */
	@RequestMapping(value="/main/login", method = RequestMethod.POST)
	public ModelAndView userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mainService.userLogin(request);
		
//		if (success > 0)
//		{
//			System.out.println("로그인성공");
////			mv.setViewName("main/join");
//		}
//		else
//		{
//			System.out.println("로그인실패");
//		}
		
		return mv;
	}
	
	
}
