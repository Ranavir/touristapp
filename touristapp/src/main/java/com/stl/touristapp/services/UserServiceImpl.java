package com.stl.touristapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.stl.touristapp.pojo.User;
import com.stl.touristapp.repository.UserJpaRepository;

/**
 * 
 * @author Ranavir
 *
 */
@Service
@PropertySource("classpath:application.properties")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserJpaRepository userRepository;
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User findByLoyaltyId(long id) {
		return userRepository.findByLoyaltyId(id);
	}

}
