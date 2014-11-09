package com.slatly.arch.platform.db.service;

import java.util.List;

import com.slatly.arch.platform.db.model.message.Message;

public interface MessagePostingService {
	
	
	public Message createMessage(String msgContent, long createdUserId);
	
	
	public Message createAndSaveMessage(String msgContent, long createdUserId);
	
	public void saveMessage(Message msg);
	
	public Message getMessageById(long msgId);
	
	public List<Message> getMessagesByCreatedUserId(long userId);

}
