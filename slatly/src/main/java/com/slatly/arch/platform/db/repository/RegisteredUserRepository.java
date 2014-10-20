package com.slatly.arch.platform.db.repository;

import org.springframework.data.mongodb.repository.Query;
import com.slatly.arch.platform.db.model.user.RegisteredUser;


public interface RegisteredUserRepository extends BaseRepository<RegisteredUser, Long> {
	
	@Query("{'security.email':?0}")
	public RegisteredUser findRegisteredUserByEmail(String email);
	
}
