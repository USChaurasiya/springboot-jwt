package com.uma.jwtspringboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uma.jwtspringboot.model.User;

/**
 * @author Uma Shankar
 * Created On 27 Oct 2017
 * Interface which is extending CrudRepository and contains methods to perform
 * the Operation related to Data Base.
 *
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User save(User user);

	/**
	 * This method is Used to get the User Corresponding to the given email id. 
	 * @param email
	 * @return User Object
	 */
	User findByEmail(String email);
}
