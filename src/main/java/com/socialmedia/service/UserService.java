package com.socialmedia.service;


import org.springframework.stereotype.Service;

import com.socialmedia.dto.RepositoryData;
import com.socialmedia.dto.UserDTO;

@Service
public interface UserService{
	public RepositoryData saveUser(UserDTO dto);
	public RepositoryData updatePassword(UserDTO dto);
	public RepositoryData getUserProfile(String username);
	public RepositoryData getMessage(String username);
	public RepositoryData getPost(String username);
	public RepositoryData getFollow(String username);
}
