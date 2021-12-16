package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userid;
	private String name;
	private String phone;
	
	@OneToMany
	List<Contact>contacts=new ArrayList<>();

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", phone=" + phone + ", contacts=" + contacts + "]";
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Long userid, String name, String phone, List<Contact> contacts) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	public User(Long userid, String name, String phone) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	

}
