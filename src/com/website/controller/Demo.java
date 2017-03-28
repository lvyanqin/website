package com.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {

	@RequestMapping(value = "/index.do")
	public ModelAndView main(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index");
		return mv;
	}
	
	@RequestMapping(value = "/index2.do")
	public ModelAndView main2(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index2");
		return mv;
	}
	
	@RequestMapping(value = "/main.do")
	public ModelAndView main3(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main");
		return mv;
	}
	
//	@RequestMapping(value = "/test.do")
//	@ResponseBody
//	public String test(){
//		return "111";
//	}
	
}
