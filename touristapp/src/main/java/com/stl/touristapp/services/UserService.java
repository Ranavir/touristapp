package com.stl.touristapp.services;

import java.util.List;

import com.stl.touristapp.pojo.User;

public interface UserService {

	List<User> findAllUsers();

	User findByLoyaltyId(long id);

}
