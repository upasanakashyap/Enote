package com.smart.services;

import com.smart.enities.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);

}
