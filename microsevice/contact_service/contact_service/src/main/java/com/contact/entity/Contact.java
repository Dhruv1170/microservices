package com.contact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cid;
	private String email;
	private String contactName;
	
	private Long userid;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Contact(Long cid, String email, String contactName, Long userid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userid = userid;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

}
