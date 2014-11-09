package com.slatly.arch.platform.db.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Messages implements Serializable {
	
	private static final long serialVersionUID = 4999687821724656606L;

	private List<Long> postMessagesIds;
	
	private List<InboxMessage> inboxMessages;
	
	public Messages(){
		postMessagesIds = new ArrayList<>();
		inboxMessages = new ArrayList<>();
	}
	
	public List<Long> getPostMessagesIds() {
		return postMessagesIds;
	}

	public void setPostMessagesIds(List<Long> postMessagesIds) {
		this.postMessagesIds = postMessagesIds;
	}

	public List<InboxMessage> getInboxMessages() {
		return inboxMessages;
	}

	public void setInboxMessages(List<InboxMessage> inboxMessages) {
		this.inboxMessages = inboxMessages;
	}
	
	public void addInboxMessage(InboxMessage msg){
		this.inboxMessages.add(msg);	
	}
		
	public void addPostedMessageId(long msgId){
		this.postMessagesIds.add(msgId);
	}
}
