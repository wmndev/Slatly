package com.slatly.arch.platform.db.model.user;

public class InboxMessage {
	
	private long messageId;
	
	private boolean isRead;
	
	public InboxMessage(){}
	
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
