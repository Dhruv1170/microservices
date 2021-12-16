package com.contact.repository;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.contact.entity.Contact;


public interface ContactRepository extends CrudRepository<Contact,Long>  {
	
	List<Contact> findByuserid(Long userid);

}
