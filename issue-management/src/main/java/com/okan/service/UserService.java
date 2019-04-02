package com.okan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.okan.entity.Issue;
import com.okan.entity.IssueHistory;
import com.okan.entity.User;

public interface UserService {
	
	User save(User user);
	
	User getById(Long id);
	
	Page<User> getAllPageable(Pageable pageable);
	
	Boolean delete(User user);
	
	User getByUsername(String username);
}
