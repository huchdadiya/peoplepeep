package com.peoplepeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {


	@RequestMapping({ "/", "/index" })
	public ModelAndView indexPage( ModelMap model) {

		ModelAndView modelAndView = new ModelAndView("index");	
		return modelAndView;
	}
}
