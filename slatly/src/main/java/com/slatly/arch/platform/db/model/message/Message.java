package com.slatly.arch.platform.db.model.message;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="messages")
public class Message {
	
	@Id
	private long id;
	
	private List<Attachment> attachments;
	
	private long createdByUser;
	
	private Date createdDate;
	
	private Statistics statistics;
	
	private Distribution distribution;
	
	public Message(){}
	
	public Message(long createdByUser){
		this.createdByUser = createdByUser;
		this.createdDate = new Date(System.currentTimeMillis());
		this.statistics = new Statistics();
		this.distribution = new Distribution();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public long getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public void setDistribution(Distribution distribution) {
		this.distribution = distribution;
	}

}
