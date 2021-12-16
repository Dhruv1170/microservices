package com.user.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.entity.User;



public interface UserRepository extends CrudRepository<User,Long> {
	@Query("SELECT m FROM User m WHERE m.userid= :userid" )
    User getUserById(@Param("userid") Long userid);
	
	
}
