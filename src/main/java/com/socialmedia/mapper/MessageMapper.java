package com.socialmedia.mapper;

import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socialmedia.dto.MessageDTO;
import com.socialmedia.entity.Message;
import com.socialmedia.repository.UserRepo;

@Component
public class MessageMapper {
	@Autowired
	private UserRepo userRepo;
	public Message toEntity(MessageDTO dto) {
		Message entity= new Message();
		entity.setReciver(userRepo.findByUsername(dto.getReciverUserName()));
		entity.setSender(userRepo.findByUsername(dto.getSenderUserName()));
		entity.setText(dto.getText());
		entity.setSendDate(new Timestamp(System.currentTimeMillis()));
		return entity;
	}
	public MessageDTO toDTO(Message entity) {
		MessageDTO dto= new MessageDTO();
		dto.setReciverUserName(entity.getReciver().getUsername());
		dto.setSenderUserName(entity.getSender().getUsername());
		dto.setText(entity.getText());
		dto.setSendDate(entity.getSendDate().toString());
		return dto;
	}
}
