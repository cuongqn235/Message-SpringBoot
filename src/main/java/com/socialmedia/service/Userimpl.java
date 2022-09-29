  package com.socialmedia.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.socialmedia.dto.FollowDTO;
import com.socialmedia.dto.MessageDTO;
import com.socialmedia.dto.PostDTO;
import com.socialmedia.dto.RepositoryData;
import com.socialmedia.dto.UserDTO;
import com.socialmedia.entity.User;
import com.socialmedia.mapper.FollowMapper;
import com.socialmedia.mapper.MessageMapper;
import com.socialmedia.mapper.PostMapper;
import com.socialmedia.mapper.UserMapper;
import com.socialmedia.mapper.UserProfileMapper;
import com.socialmedia.repository.UserRepo;

@Component
public class Userimpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserProfileMapper userProfileMapper;
	@Autowired
	private MessageMapper messageMapper;
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private FollowMapper followMapper; 

	@Override
	public RepositoryData saveUser(UserDTO dto) {
//		User user = userRepo.findByUsername(dto.getUsername());
//		if (user == null) {
//			user = userMapper.toEntity(dto);
//		} else {
//
//		}
//		return new RepositoryData(ResponseEntity.status(HttpStatus.));
		return null;
	}

	@Override
	public RepositoryData updatePassword(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RepositoryData getUserProfile(String username) {
		User user = userRepo.findByUsername(username);
		if(user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO = userMapper.toDTO(user);
			userDTO.setUserProfileDTO(userProfileMapper.toDTO(user.getUserProfile()));
			return new RepositoryData(ResponseEntity.ok().body(userDTO.getUserProfileDTO()));
		}
		else {
			return new RepositoryData(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy "+username));
		}
	}

	@Override
	public RepositoryData getMessage(String username) {
		User user = userRepo.findByUsername(username);
		if(user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO = userMapper.toDTO(user);
			List<MessageDTO> messageReciverDTOs =new ArrayList<>();
			user.getRecive().forEach(item->{
				messageReciverDTOs.add(messageMapper.toDTO(item));
			});
			user.getSend().forEach(item->{
				messageReciverDTOs.add(messageMapper.toDTO(item));
			});
			Collections.sort(messageReciverDTOs, new Comparator<MessageDTO>() {
				@Override
				  public int compare(MessageDTO m1, MessageDTO m2) {
				    return m2.getSendDate().compareTo(m1.getSendDate());
				  }
			});
			userDTO.setMessageDTOs(messageReciverDTOs);
			return new RepositoryData(ResponseEntity.ok().body(userDTO.getMessageDTOs()));
		}
		else {
			return new RepositoryData(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìn thấy "+username));
		}
	}

	@Override
	public RepositoryData getPost(String username) {
		User user = userRepo.findByUsername(username);
		if(user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO = userMapper.toDTO(user);
			List<PostDTO> postDTOs =new ArrayList<>();
			user.getPosts().forEach(item->{
				postDTOs.add(postMapper.toDTO(item));
			});
			userDTO.setPostDTOs(postDTOs);
			return new RepositoryData(ResponseEntity.ok().body(userDTO.getPostDTOs()));
		}
		else {
			return new RepositoryData(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìn thấy "+username));
		}
	}
	@Override
	public RepositoryData getFollow(String username) {
		User user = userRepo.findByUsername(username);
		if(user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO = userMapper.toDTO(user);
			List<FollowDTO> followDTOs =new ArrayList<>();
			user.getListFriend().forEach(item->{
				followDTOs.add(followMapper.toDTO(item));
			});
			userDTO.setFollowDTOs(followDTOs);
			return new RepositoryData(ResponseEntity.ok().body(userDTO.getFollowDTOs()));
		}
		else {
			return new RepositoryData(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìn thấy "+username));
		}
	}

}
