package com.slatly.arch.platform.db.model.message;

public class Statistics {
	
	private long totalViews;
	
	private int totalLikes;
	
	private int totalDislikes;
	
	public Statistics(){
		setTotalViews(0);
		setTotalLikes(0);
		setTotalDislikes(0);		
	}

	public long getTotalViews() {
		return totalViews;
	}

	public void setTotalViews(long totalViews) {
		this.totalViews = totalViews;
	}

	public int getTotalLikes() {
		return totalLikes;
	}

	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}

	public int getTotalDislikes() {
		return totalDislikes;
	}

	public void setTotalDislikes(int totalDislikes) {
		this.totalDislikes = totalDislikes;
	}

}
