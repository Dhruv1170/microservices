package com.user.controller;



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

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	 @Autowired
	 private UserService userService;
	 
	
	 //add user
	 @PostMapping("/addusers")
	public ResponseEntity<User> addUser(@RequestBody User user){
			User u=null;
			try {
				u=this.userService.addUser(user);
				return ResponseEntity.of(Optional.of(u));
				
			} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
	
	//get user by Id
	@GetMapping("/{userid}")
	public ResponseEntity<User> getuser(@PathVariable("userid") Long userid) {
		User user= userService.getUser(userid);
	    return new ResponseEntity<User>(user,HttpStatus.OK);
		}
	
	//delete user
		@DeleteMapping("/delusers/{userid}")
		public void deleteUser(@PathVariable ("userid") Long userid) {
		 this.userService.deleteUser(userid);
			
			
	}

}
