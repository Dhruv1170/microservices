package com.contact.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;


@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired 
	private ContactService contactService;
	
	@GetMapping("/user/{userid}")
	public ResponseEntity<List<Contact>> getContacts(@PathVariable ("userid") Long userid){
		
		List<Contact> contacts= contactService.getcontactOfUser(userid);
		return new ResponseEntity<List<Contact>>(contacts,HttpStatus.OK);
	}
	
	 @PostMapping("/addcontact")
		public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
			Contact c=null;
			try {
				c=this.contactService.addContact(contact);
				return ResponseEntity.of(Optional.of(c));
				
			} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	 }
			
		
	 
	@DeleteMapping("/{cid}")
    public void delContact(@PathVariable ("cid") Long cid){
		
		 this.contactService.delContact(cid);
	 }

	
	
}


