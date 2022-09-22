package com.socialmedia.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private String username;
	private String email;
	private String password;
	private String accountStatus;
	private UserProfileDTO userProfileDTO;
	private List<PostDTO> postDTOs;
	private List<MessageDTO> messageDTOs;
	private List<FollowDTO> followDTOs;
}
