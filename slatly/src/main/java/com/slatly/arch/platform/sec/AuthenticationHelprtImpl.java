package com.slatly.arch.platform.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.slatly.arch.platform.db.service.RegisteredUserService;

@Component
public class AuthenticationHelprtImpl implements AuthenticationHelper {

	@Autowired
	private RegisteredUserService registeredUserService;
	
	@Override
	public String getCurrentLogggedInUserName() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User)authentication.getPrincipal();
		return user.getUsername();
	}

	@Override
	public long getCurrentLogggedInUserId() {
		String userName = getCurrentLogggedInUserName();
		return registeredUserService.getRegisteredUserByEmail(userName).getId();
	}

}
