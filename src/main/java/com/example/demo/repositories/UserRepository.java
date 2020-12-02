package com.example.demo.repositories;

import com.example.demo.domains.UserDTO;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public int insert(UserDTO user) {
		return 0;
	}

	public UserDTO login(UserDTO user) {
		return null;
	}
    
}
