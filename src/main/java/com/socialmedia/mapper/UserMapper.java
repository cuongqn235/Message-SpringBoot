package com.socialmedia.mapper;

import org.springframework.stereotype.Component;

import com.socialmedia.dto.UserDTO;
import com.socialmedia.entity.User;

@Component
public class UserMapper {
	public User toEntity(UserDTO dto) {
		User entity = new User();
		entity.setUsername(dto.getUsername());
		entity.setPassword(dto.getPassword());
		entity.setEmail(dto.getEmail());
		entity.setAccountStatus(dto.getAccountStatus());
		return entity;
	}
	public UserDTO toDTO(User entity) {
		UserDTO dto = new UserDTO();
		dto.setUsername(entity.getUsername());
		dto.setEmail(entity.getEmail());
		dto.setAccountStatus(entity.getAccountStatus());
		return dto;
	}
}
