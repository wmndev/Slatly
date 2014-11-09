package com.slatly.arch.platform.db.service;

import com.slatly.arch.platform.execption.SequenceException;

public interface SequenceService {
	
	long getNextSequenceId(String key) throws SequenceException;

}
