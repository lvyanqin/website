package com.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {

	@RequestMapping(value = "/personalProfile.do")
	public ModelAndView personalProfile(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/personalProfile");
		return mv;
	}
	
	@RequestMapping(value = "/personalWorks.do")
	public ModelAndView personalWorks(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/personalWorks");
		return mv;
	}
	
	@RequestMapping(value = "/index.do")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index");
		return mv;
	}
	
	@RequestMapping(value = "/detail.do")
	public ModelAndView detail(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/detail");
		return mv;
	}
	
	@RequestMapping(value = "/list.do")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/list");
		return mv;
	}
}
