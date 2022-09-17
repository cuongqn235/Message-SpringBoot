package com.socialmedia.service;


import org.springframework.stereotype.Service;

import com.socialmedia.dto.UserDto;
@Service
public interface UserService{
	public String save(UserDto dto);
	public String updatePassword(UserDto dto);
}
