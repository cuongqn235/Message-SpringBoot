package com.socialmedia.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCommentDTO {
	private String comment;
	private Date datecomment;
	private String username;
}
