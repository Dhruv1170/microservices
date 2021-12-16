package com.contact.service;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactService {
	
	
	public List<Contact> getcontactOfUser(Long userid);

	public Contact addContact(Contact contact);
	public void delContact(Long cid);
		

	
}
