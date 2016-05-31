package com.mkking.springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mkking.springmvc.service.HelloService;

@Controller
public class HelloController {
	
	private HelloService helloService;
	
	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@RequestMapping("/")
	public String homepage(){
		
		return "hello";
		
	}
	
	@RequestMapping("/fruits")
	public ModelAndView greeting(){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("fruit");
		model.addObject("fruitList", helloService.getListFruits());
		
		return model;
	}
	
}