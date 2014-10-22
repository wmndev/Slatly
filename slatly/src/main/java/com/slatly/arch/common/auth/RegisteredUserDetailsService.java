package com.slatly.arch.common.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.slatly.arch.platform.db.model.user.RegisteredUser;
import com.slatly.arch.platform.db.service.RegisteredUserService;


@Transactional(readOnly = true)
public class RegisteredUserDetailsService implements UserDetailsService {

	@Autowired
	private RegisteredUserService registeredUserService;
	
	
	@Override
	public UserDetails loadUserByUsername(String email)
			throws UsernameNotFoundException {
		RegisteredUser rUser = registeredUserService.getRegisteredUserByEmail(email);
		
		
		UserDetails user = new User(
			     rUser.getSecurity().getEmail(), 
			     rUser.getSecurity().getPassword(),
			     true,
			     true,
			     true,
			     true,
			     getAuthorities(1) );
		
		return user;
	}
	
	@SuppressWarnings("deprecation")
	public Collection<GrantedAuthority> getAuthorities(Integer access) {
		List<GrantedAuthority> authList = new ArrayList<>();
		if (access == 1){
			authList.add(new GrantedAuthorityImpl("ROLE_USER"));
		}
		
		return authList;
	}

}
