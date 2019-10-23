package com.easy.eat.EASYEATBACK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.eat.EASYEATBACK.Documents.User;
import com.easy.eat.EASYEATBACK.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository persistentUser;
	
	public void CreateUser(User user) {
		persistentUser.insert(user);
	}
	
	public List<User> findAllUser() {
		return persistentUser.findAll();
	}
	
	public User findUserbyPassword(String email,String password) {
		List<User> users = persistentUser.findAll();
		for(User u:users) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
		
	}
	

}
