package com.olengski;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	private Comment[] rows; 
	private long totalRecords;
	private long lastPage;
	public Comment[] getRows() {
		return rows;
	}
	public void setRows(Comment[] rows) {
		this.rows = rows;
	}
	public long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public long getLastPage() {
		return lastPage;
	}
	public void setLastPage(long lastPage) {
		this.lastPage = lastPage;
	}
	
	
}
