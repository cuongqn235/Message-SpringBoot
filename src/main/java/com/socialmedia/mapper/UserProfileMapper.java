package com.socialmedia.mapper;

import org.springframework.stereotype.Component;

import com.socialmedia.dto.UserProfileDTO;
import com.socialmedia.entity.UserProfile;

@Component
public class UserProfileMapper {
	public UserProfileDTO toDTO(UserProfile entity) {
		UserProfileDTO dto= new UserProfileDTO();
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setAbout(entity.getAbout());
		dto.setBirthDay(entity.getBirthDay());
		dto.setDateUpdated(entity.getDateUpdated());
		dto.setGender(entity.getGender());
		return dto;
	}
	public UserProfile toEntity(UserProfileDTO dto) {
		UserProfile entity= new UserProfile();
		return entity;
	}
}
