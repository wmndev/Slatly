package com.slatly.arch.platform.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.slatly.arch.platform.db.model.user.RegisteredUser;
import com.slatly.arch.platform.db.repository.RegisteredUserRepository;

@Component
public class RegisteredUserServiceImpl implements RegisteredUserService {

	@Autowired
	private RegisteredUserRepository repository;
	
	@Override
	public void saveRegisteredUser(RegisteredUser user) {
		repository.save(user);
	}

	@Override
	public RegisteredUser getRegisteredUserByEmail(String email) {
		return repository.findRegisteredUserByEmail(email);
	}

	@Override
	public RegisteredUser createRegisteredUserObject(String email,
			String password) {
		return new RegisteredUser(email, password);
	}

}
