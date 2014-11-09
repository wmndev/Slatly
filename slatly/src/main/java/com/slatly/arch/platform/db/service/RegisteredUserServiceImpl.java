package com.slatly.arch.platform.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.slatly.arch.platform.db.codes.SequenceTypes;
import com.slatly.arch.platform.db.model.message.Message;
import com.slatly.arch.platform.db.model.user.RegisteredUser;
import com.slatly.arch.platform.db.repository.RegisteredUserRepository;

@Service
public class RegisteredUserServiceImpl implements RegisteredUserService {
	
	@Autowired
	private MongoOperations mongoOperation;

	@Autowired
	private RegisteredUserRepository repository;
	
	@Autowired
	private SequenceService sequenceService;
	
	@Override
	public void saveRegisteredUser(RegisteredUser user) {
		repository.save(user);
	}

	@Override
	public RegisteredUser getRegisteredUserByEmail(String email) {
		return repository.findRegisteredUserByEmail(email);
	}

	@Override
	public RegisteredUser createRegisteredUserObject(String email,
			String password) {
		long nextId = sequenceService.getNextSequenceId(SequenceTypes.USERS.getId());
		return new RegisteredUser(nextId, email, password);
	}

	@Override
	public RegisteredUser getRegisteredUserById(long id) {
		return repository.findOne(id);
	}

	@Override
	public void addePostedMsgToUser(long loggedInUserId, Message message) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(loggedInUserId));
		query.fields().include("messages");
		
		RegisteredUser user = mongoOperation.findOne(query, RegisteredUser.class);

		user.getMessages().addPostedMessageId(message.getId());
		
		Update update = new Update();
		update.set("messages", user.getMessages());
		
		mongoOperation.updateFirst(query, update, RegisteredUser.class);		
	}

}
