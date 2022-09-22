package com.socialmedia.mapper;

import org.springframework.stereotype.Component;

import com.socialmedia.dto.PostCommentDTO;
import com.socialmedia.entity.PostComment;

@Component
public class PostCommentMapper {
	public PostCommentDTO toDTO(PostComment entity) {
		PostCommentDTO dto= new PostCommentDTO();
		dto.setComment(entity.getComment());
		dto.setDatecomment(entity.getDatecomment());
		dto.setUsername(entity.getUser().getUsername());
		return dto;
	}
	public PostComment toEntity(PostCommentDTO dto) {
		PostComment entity= new PostComment();
		entity.setComment(dto.getComment());
		entity.setDatecomment(dto.getDatecomment());
		return entity;
	}
}
