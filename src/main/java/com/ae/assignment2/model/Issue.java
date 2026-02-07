package com.ae.assignment2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Issue {

	@Id
	private String issueId;
	private String bookId;
	private String membId;
	private String dueDate;
	private String returnDate;

	public Issue() {
		super();
	}

	public Issue(String issueId, String bookId, String membId, String dueDate, String returnDate) {
		super();
		this.issueId = issueId;
		this.bookId = bookId;
		this.membId = membId;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getMembId() {
		return membId;
	}

	public void setMembId(String membId) {
		this.membId = membId;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
