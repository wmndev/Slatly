package com.slatly.arch.platform.db.service;

import com.slatly.arch.platform.db.model.message.Message;
import com.slatly.arch.platform.db.model.user.RegisteredUser;

public interface RegisteredUserService {
	
	public void saveRegisteredUser(RegisteredUser user);
	
	public RegisteredUser getRegisteredUserByEmail(String email);
	
	public RegisteredUser createRegisteredUserObject(String email, String password);
	
	public RegisteredUser getRegisteredUserById(long id);

	public void addePostedMsgToUser(long loggedInUserId, Message message);
}
