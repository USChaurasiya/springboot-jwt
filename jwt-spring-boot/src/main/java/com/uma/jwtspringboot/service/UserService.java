package com.uma.jwtspringboot.service;

import com.uma.jwtspringboot.model.User;

public interface UserService {
	User save(User user);

	User findByEmail(String email);

}
