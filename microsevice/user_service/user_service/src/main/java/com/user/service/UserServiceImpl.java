package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public RestTemplate restTemplate;
	
//	public List<User> list = new ArrayList<>();
//  {
//	  list.add(new User(101L,"sahil","1234667895"));
//	  list.add(new User(102L,"hardik","1111111111"));
//	  list.add(new User(103L,"Dhruv","999999999"));
//	  
//  }


	public User getUser(Long userid) {
		User user=userRepository.getUserById(userid);
		List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserid(), List.class);
        user.setContacts(contacts);
		return user;

	}

	// create user
	public User addUser(User u) {
		User result=userRepository.save(u);
		return result;
		}
	


	@Override
	public void deleteUser(Long userid) {
		userRepository.deleteById(userid);
		
	}
	

	
	}
	
//	//get User By UserId
//		public User getUserByID(Long id) {
//	 
//			User user=null;
//			try {
//				
//			user=list.stream().filter(e->e.getId()==id).findFirst().get();
//				user=this.userRepository.getUser(Long userid);
//				}
//			catch(Exception e){
//				e.printStackTrace();
//				v sv
//			}
//			return user;
//		}


