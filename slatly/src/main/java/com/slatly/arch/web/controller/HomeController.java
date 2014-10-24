package com.slatly.arch.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.slatly.arch.platform.db.model.user.RegisteredUser;
import com.slatly.arch.platform.db.service.RegisteredUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private RegisteredUserService registeredUserService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/try_login")
	public String notAuthorized(){
		return "notAuthorizedPage";	
	}
	
	@RequestMapping(value = "/sign_up_user", method = RequestMethod.POST)
	public String signUpUser(@RequestParam String email, @RequestParam String password){
		logger.info(email + "  "+ password);
		RegisteredUser user = registeredUserService.createRegisteredUserObject(email, password);
		registeredUserService.saveRegisteredUser(user);
		return "home";
	}
	
}
