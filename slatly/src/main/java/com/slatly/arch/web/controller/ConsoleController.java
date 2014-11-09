package com.slatly.arch.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.slatly.arch.common.service.MessageControllerDelegateService;
import com.slatly.arch.platform.sec.AuthenticationHelper;
import com.slatly.arch.web.model.PostMessage;
import com.slatly.arch.web.model.SimpleResponse;

@Controller
public class ConsoleController {
	
	@Autowired
	private AuthenticationHelper authHelper;
	
	@Autowired
	private MessageControllerDelegateService messageControllerDelegateService;

	
	
	@RequestMapping(value = "/console", method = RequestMethod.GET)
	public String loadUserConsole(){
		return "userMainPage";		
	}
	
	
	@RequestMapping(value = "/postMessgae", method = RequestMethod.POST, headers = {"Content-Type=application/json"})
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody SimpleResponse save (@RequestBody PostMessage msg) throws Exception{
		String msgContent = msg.getMsgContent();
		long loggedInUserId = authHelper.getCurrentLogggedInUserId();
		return messageControllerDelegateService.postMessage(msgContent, loggedInUserId);
		
	}
}
