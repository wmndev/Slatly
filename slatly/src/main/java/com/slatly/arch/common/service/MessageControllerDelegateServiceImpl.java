package com.slatly.arch.common.service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slatly.arch.platform.db.model.message.Message;
import com.slatly.arch.platform.db.service.MessagePostingService;
import com.slatly.arch.platform.db.service.RegisteredUserService;
import com.slatly.arch.platform.jms.MessageWrapper;
import com.slatly.arch.platform.jms.sender.MessageSenderService;
import com.slatly.arch.web.model.SimpleResponse;

import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.CorefCoreAnnotations.CorefChainAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.NERIDAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations.TreeAnnotation;
import edu.stanford.nlp.util.CoreMap;

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
		 
		 test();
		 
		SimpleResponse response = new SimpleResponse();
		response.setSuccess("Thank you for your post");
	    return response;
		
	}

	private void test() {
		

		
	}

}
