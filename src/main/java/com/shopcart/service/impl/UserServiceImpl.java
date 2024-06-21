package com.shopcart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopcart.model.UserDtls;
import com.shopcart.repository.UserRepository;
import com.shopcart.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDtls saveUser(UserDtls user) {
		UserDtls saveUser = userRepository.save(user);
		return saveUser;
	}

}