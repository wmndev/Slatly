package com.slatly.arch.platform.db.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
@TypeAlias("registeredUser")
public class RegisteredUser implements Serializable {

	private static final long serialVersionUID = -1827556206403387044L;
	
	@Id
	private long id;
	
	private Date createdDate;
	
	private Security security;
	
	private List<UserMessage> messages;
	
	public RegisteredUser(String email, String password){
		this.id = System.currentTimeMillis();
		this.setSecurity(new Security(email, password));
		this.setCreatedDate(new Date(System.currentTimeMillis()));
		this.messages = new ArrayList<>(); 		
	}
	
	public RegisteredUser(){}
		
	public long getId(){
		return this.id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public List<UserMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<UserMessage> messages) {
		this.messages = messages;
	}

}
