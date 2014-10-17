package com.slatly.arch.platform.db.service;

import com.slatly.arch.platform.db.model.user.RegisteredUser;

public interface RegisteredUserService {
	
	public void saveRegisteredUser(RegisteredUser user);
	
	public RegisteredUser getRegisteredUserByEmail(String email);

}
