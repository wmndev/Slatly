package com.slatly.arch.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slatly.arch.platform.db.model.message.Message;
import com.slatly.arch.platform.db.service.MessagePostingService;
import com.slatly.arch.platform.db.service.RegisteredUserService;
import com.slatly.arch.platform.jms.MessageWrapper;
import com.slatly.arch.platform.jms.sender.MessageSenderService;
import com.slatly.arch.web.model.SimpleResponse;

@Service
public class MessageControllerDelegateServiceImpl implements
		MessageControllerDelegateService {
	
	@Autowired
	private MessagePostingService messagePostingService;
	@Autowired
	private RegisteredUserService registeredUserService;
	@Autowired
	private MessageSenderService messageSender;

	@Override
	public SimpleResponse postMessage(String msgContent, long userId) {
		 Message message = messagePostingService.createAndSaveMessage(msgContent, userId);
		 
		 registeredUserService.addePostedMsgToUser(userId, message);
		 
		 messageSender.sendMessage(new MessageWrapper(message));
		 
		SimpleResponse response = new SimpleResponse();
		response.setSuccess("Thank you for your post");
	    return response;
		
	}

}
