package com.socialmedia.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialmedia.dto.FollowDTO;
import com.socialmedia.entity.Follow;
import com.socialmedia.repository.UserRepo;

@Component
public class FollowMapper {
	@Autowired
	private UserRepo userRepo;
	public Follow toEntity(FollowDTO dto) {
		Follow entity = new Follow();
		entity.setDateFollowed(dto.getDateFollowed());
		entity.setFollower(userRepo.findByUsername(dto.getUsername()));
		return entity;
	}
	public FollowDTO toDTO(Follow entity) {
		FollowDTO dto = new FollowDTO();
		dto.setDateFollowed(entity.getDateFollowed());
		dto.setUsername(entity.getFollower().getUsername());
		return dto;
	}
}
