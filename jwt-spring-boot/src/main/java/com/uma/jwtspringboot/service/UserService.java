package com.uma.jwtspringboot.service;

import com.uma.jwtspringboot.model.User;

/**
 * @author Uma Shankar
 * Created on 27 Oct 2017
 *
 */
public interface UserService {
	User save(User user);

	/**
	 * This method is Used to get the User Corresponding to the given email id.
	 * @param email
	 * @return User Object
	 */
	User findByEmail(String email);

}
