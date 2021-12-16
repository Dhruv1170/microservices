package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.contact.entity.Contact;
import com.contact.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	public ContactRepository contactRepository;
//	public List<Contact> list=new ArrayList<>();
////	 {
////		list.add(new Contact(1L,"sahil","sahiljp5678@gmail.com",101L));
////		list.add(new Contact(2L,"hardik","hardik5678@gmail.com",101L));
////		list.add(new Contact(3L,"Dhruv","Dhruv5678@gmail.com",103L));
////	}
////	
	

	public List<Contact> getcontactOfUser(Long userid) {
		// TODO Auto-generated method stub
		return contactRepository.findByuserid(userid);
		
//		return this.list.stream().filter(contact->contact.getUserid().equals(userid)).collect(Collectors.toList());
	}


	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		Contact result=contactRepository.save(contact);
		return result;
	}


	@Override
	public void delContact(Long cid) {
		this.contactRepository.deleteById(cid);
	}

}