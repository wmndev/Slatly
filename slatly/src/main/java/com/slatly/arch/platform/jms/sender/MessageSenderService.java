package com.slatly.arch.platform.jms.sender;

import com.slatly.arch.platform.jms.MessageWrapper;

public interface MessageSenderService {
	
	public void sendMessage(MessageWrapper message);

}
