package com.slatly.arch.platform.jms;

import java.io.Serializable;

import com.slatly.arch.platform.db.model.message.Message;

public class MessageWrapper implements Serializable {

	private static final long serialVersionUID = 4853257814111693352L;
	
	private Message message;
	
	public MessageWrapper(Message message){
		this.setMessage(message);
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	

}
