package com.socialmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialmedia.dto.UserDto;
import com.socialmedia.repository.UserRepo;
@Component
public class Userimpl implements UserService {
	@Autowired
    private UserRepo userRepo;
	@Override
	public String save(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updatePassword(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
