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
		RegisteredUser rUser = registeredUserService
				.getRegisteredUserByEmail(email);

		UserDetails user = null;
		if (rUser != null) {
			user = new User(rUser.getSecurity().getEmail(), rUser.getSecurity()
					.getPassword(), true, true, true, true, getAuthorities(1));
		}else{
			user = new User("XX_not_auth", "XX_not_auth_pwd2", false, false, false, false, getAuthorities(-1));
		}
		return user;
	}

	@SuppressWarnings("deprecation")
	public Collection<GrantedAuthority> getAuthorities(Integer access) {
		List<GrantedAuthority> authList = new ArrayList<>();
		
		switch(access){
		case 1:
			authList.add(new GrantedAuthorityImpl("ROLE_USER"));
			break;
		case 2:
			authList.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
			break;
		default:
			authList.add(new GrantedAuthorityImpl("ROLE_NOT_AUTH"));
			
		}
		return authList;
	}

}
