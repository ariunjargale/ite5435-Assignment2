package com.ae.assignment2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Publisher {

	@Id
	private String pubId;
	private String name;
	private String address;

	public Publisher() {
		super();
	}

	public Publisher(String pubId, String name, String address) {
		super();
		this.pubId = pubId;
		this.name = name;
		this.address = address;
	}

	public String getPubId() {
		return pubId;
	}

	public void setPubId(String pubId) {
		this.pubId = pubId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}