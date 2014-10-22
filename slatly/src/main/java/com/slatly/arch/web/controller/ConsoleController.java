package com.slatly.arch.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsoleController {
	
	
	@RequestMapping(value = "/console", method = RequestMethod.GET)
	public String loadUserConsole(){
		
		
		return "userMainPage";
		
	}

}
