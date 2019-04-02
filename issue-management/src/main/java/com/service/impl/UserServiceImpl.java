package com.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.okan.entity.User;
import com.okan.repository.UserRepository;
import com.okan.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {
	if(user.getEmail() == null){
		throw new IllegalArgumentException("email cannot be null");
	}
		return userRepository.save(user);
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public Page<User> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(User user) {
		 userRepository.delete(user);
		return Boolean.TRUE ;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

}
