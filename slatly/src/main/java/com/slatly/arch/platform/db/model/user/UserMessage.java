package com.slatly.arch.platform.db.model.user;

public class UserMessage {
	
	private long messageId;
	
	private boolean isRead;
	
	public UserMessage(){}
	
	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
}
