package com.slatly.arch.platform.db.model.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Distribution implements Serializable {
	

	private static final long serialVersionUID = -1195920293513577386L;

	private List<Criteria> criterias;
	
	private short maxUsersAllowed;
	
	public Distribution(){
		this.criterias = new ArrayList<>();
		this.maxUsersAllowed = 0;		
	}

	public List<Criteria> getCriterias() {
		return criterias;
	}

	public void setCriterias(List<Criteria> criterias) {
		this.criterias = criterias;
	}

	public short getMaxUsersAllowed() {
		return maxUsersAllowed;
	}

	public void setMaxUsersAllowed(short maxUsersAllowed) {
		this.maxUsersAllowed = maxUsersAllowed;
	}

}
