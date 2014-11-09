package com.slatly.arch.platform.jms.sender;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.slatly.arch.platform.jms.MessageWrapper;

@Service
public class MessageSenderServiceImpl implements MessageSenderService {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Override
	public void sendMessage(final MessageWrapper message) {
		jmsTemplate.send(new MessageCreator() {			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(message);
			}
		});
	}

}
