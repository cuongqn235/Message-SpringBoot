package com.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.dto.RepositoryData;
import com.socialmedia.service.UserService;

@RestController
public class UserAPI {
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/profile/{username}")
	public RepositoryData getUserProfile(@PathVariable("username")String username ) {
		return userService.getUserProfile(username);
	}
	@GetMapping("/user/message/{username}")
	public RepositoryData getMessage(@PathVariable("username")String username ) {
		return userService.getMessage(username);
	}
	@GetMapping("/user/post/{username}")
	public RepositoryData getPost(@PathVariable("username")String username ) {
		return userService.getPost(username);
	}
	@GetMapping("/user/follow/{username}")
	public RepositoryData getFollow(@PathVariable("username")String username ) {
		return userService.getFollow(username);
	}
}
