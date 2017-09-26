package com.stl.touristapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.touristapp.pojo.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
	List<User> findAll();
	User findByLoyaltyId(long id);
}
