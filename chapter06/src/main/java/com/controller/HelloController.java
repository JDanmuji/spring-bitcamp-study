package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) throws Exception { //사용자 콜백 메서드

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("result", "Hello Spring !!");
		
		mav.setViewName("/view/hello");
		return mav;
	}

	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2(HttpServletRequest request, HttpServletResponse response) throws Exception { //사용자 콜백 메서드

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("result2", "Hello Spring 22222!!");
		
		mav.setViewName("/WEB-INF/view2/hello2");
		return mav;
	}
	

	@RequestMapping(value="/hello3.do", method=RequestMethod.GET)
	public String hello3(HttpServletRequest request, HttpServletResponse response) throws Exception { //사용자 콜백 메서드
		return "Welcome";
	}
	//스프링에서는 return 타입이 String 이면 자동으로 파일명으로 인식한다.

}

/*
 * 
 * 콜백 메서드
 * - 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메서드
 * 
 * 
 * 
 * http://localhost:8080/Context명/hello.do
 * 
 * Dispatcher Servlet
 * 		 ↕ HandlerMapping
 * HelloController
 * 
 * 
 * 
 * 
 * 
 */
