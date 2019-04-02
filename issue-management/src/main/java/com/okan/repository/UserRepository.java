package com.okan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okan.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
}
