package com.slatly.arch.platform.db.codes;

public enum SequenceTypes {
	USERS("users"), MESSAGES("messages");

	private final String id;

	SequenceTypes(String id) {
		this.id = id;
	}

	public String getId() {
		return id;

	}
}
