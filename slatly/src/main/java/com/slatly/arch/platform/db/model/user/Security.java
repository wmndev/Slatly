package com.slatly.arch.platform.db.model.user;

import java.io.Serializable;

public class Security implements Serializable {

	private static final long serialVersionUID = 8608379064539236577L;
	
	private String email;
	
	private String password;
	
	private boolean status;
	
	
	public Security(){}
	
	public Security(String email, String password){
		this.email = email;
		this.password = password;
		status = true;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
