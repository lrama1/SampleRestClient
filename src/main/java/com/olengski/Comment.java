package com.olengski;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

	private String calcCommentId;
	private String calcCommentTextHeader;
	public String getCalcCommentId() {
		return calcCommentId;
	}
	public void setCalcCommentId(String calcCommentId) {
		this.calcCommentId = calcCommentId;
	}
	public String getCalcCommentTextHeader() {
		return calcCommentTextHeader;
	}
	public void setCalcCommentTextHeader(String calcCommentTextHeader) {
		this.calcCommentTextHeader = calcCommentTextHeader;
	}
	
	
}
