package com.socialmedia.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
	private String title;
	private String content;
	private String status;
	private Date datePublished;
	private List<PostCommentDTO> postCommentDTOs;
}
