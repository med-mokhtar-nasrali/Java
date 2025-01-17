package com.loginandregistration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.loginandregistration.models.User;

public interface UserRepository extends CrudRepository<User,Long> {


	//get all users
	List<User> findAll();
	
	//get user by email
	Optional<User> findByEmail(String email);
}
