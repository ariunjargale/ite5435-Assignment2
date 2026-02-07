package com.ae.assignment2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Member {

	@Id
	private String membId;
	private String name;
	private String address;
	private String membType;
	private String membDate;
	private String expiryDate;

	public Member() {
		super();
	}

	public Member(String membId, String name, String address, String membType, String membDate, String expiryDate) {
		super();
		this.membId = membId;
		this.name = name;
		this.address = address;
		this.membType = membType;
		this.membDate = membDate;
		this.expiryDate = expiryDate;
	}

	public String getMembId() {
		return membId;
	}

	public void setMembId(String membId) {
		this.membId = membId;
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

	public String getMembType() {
		return membType;
	}

	public void setMembType(String membType) {
		this.membType = membType;
	}

	public String getMembDate() {
		return membDate;
	}

	public void setMembDate(String membDate) {
		this.membDate = membDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
