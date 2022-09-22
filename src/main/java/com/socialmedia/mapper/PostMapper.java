package com.socialmedia.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialmedia.dto.PostCommentDTO;
import com.socialmedia.dto.PostDTO;
import com.socialmedia.entity.Post;

@Component
public class PostMapper {
	@Autowired
	private PostCommentMapper postCommentMapper;

	public Post toEntity(PostDTO dto) {
		Post entity = new Post();
		entity.setContent(dto.getContent());
		entity.setDatePublished(dto.getDatePublished());
		entity.setStatus(dto.getStatus());
		entity.setTitle(dto.getTitle());
		return entity;
	}

	public PostDTO toDTO(Post entity) {
		PostDTO dto = new PostDTO();
		dto.setContent(entity.getContent());
		dto.setDatePublished(entity.getDatePublished());
		dto.setStatus(entity.getStatus());
		dto.setTitle(entity.getTitle());
		List<PostCommentDTO> commentDTOs = new ArrayList<>();
		entity.getPostcomments().forEach(item -> {
			commentDTOs.add(postCommentMapper.toDTO(item));
		});
		dto.setPostCommentDTOs(commentDTOs);
		return dto;
	}
}
