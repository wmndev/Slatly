package com.slatly.arch.platform.db.model.user;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class RegisteredUser implements Serializable {

	private static final long serialVersionUID = -1827556206403387044L;
	
	@Id
	private long id;
	
	private Date createdDate;
	
	private UserSecurity security;
	
	public RegisteredUser(String email, String password){
		this.id = System.currentTimeMillis();
		this.setSecurity(new UserSecurity(email, password));
		this.setCreatedDate(new Date(System.currentTimeMillis()));
		
	}
	
	public long getId(){
		return this.id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public UserSecurity getSecurity() {
		return security;
	}

	public void setSecurity(UserSecurity security) {
		this.security = security;
	}
	
	
	
	
	
	
	

}
