package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
	  User findByConfirmationToken(String confirmationToken);

}
