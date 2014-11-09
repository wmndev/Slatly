package com.slatly.arch.platform.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.slatly.arch.platform.jms.MessageWrapper;

@Component
public class MessageConsumer implements MessageListener {
	
	@Autowired
	private JmsTemplate jmsTemplate;


	@Override
	public void onMessage(Message jmsMessage) {
		try {
			MessageWrapper msgWrapper =  (MessageWrapper)((ObjectMessage)jmsMessage).getObject();
		System.out.println(msgWrapper.getMessage().getContent());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}








}
