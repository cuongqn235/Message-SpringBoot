package com.socialmedia.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.socialmedia.dto.MessageDTO;

public interface MessageService {
	List<MessageDTO> GetMessage();
	List<MessageDTO> GetMessage(Pageable pageable);
	List<MessageDTO> SaveMessage(MessageDTO dto);
	int getTotalItem();
}
