package com.slatly.arch.common.service;

import com.slatly.arch.web.model.SimpleResponse;

public interface MessageControllerDelegateService {
	
	
	public SimpleResponse postMessage(String msgContent, long createdUserId);

}
