package com.slatly.arch.platform.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slatly.arch.platform.db.codes.SequenceTypes;
import com.slatly.arch.platform.db.model.message.Message;
import com.slatly.arch.platform.db.model.user.RegisteredUser;
import com.slatly.arch.platform.db.repository.MessageRepository;

@Service
public class MessagePostingServiceImpl implements MessagePostingService {

	@Autowired
	private MessageRepository messageRepository;
	
	@Autowired
	private RegisteredUserService registeredUserService;
	
	@Autowired
	private SequenceService sequenceService;
	
	@Override
	@Transactional
	public Message createMessage(String msgContent, long createdUserId) {
		long msgId = sequenceService.getNextSequenceId(SequenceTypes.MESSAGES.getId());
		Message message = new Message(msgId, createdUserId);
		message.setContent(msgContent);
		
		return message;
	}

	@Override
	public void saveMessage(Message msg) {
		messageRepository.save(msg);

	}

	@Override
	public Message getMessageById(long msgId) {
		return null;
	}

	@Override
	public List<Message> getMessagesByCreatedUserId(long userId) {
		return null;
	}

	@Override
	public Message createAndSaveMessage(String msgContent, long createdUserId) {
		Message msg = createMessage(msgContent, createdUserId);
		saveMessage(msg);
		return msg;
	}

}
