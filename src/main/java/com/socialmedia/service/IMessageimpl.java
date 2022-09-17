package com.socialmedia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.socialmedia.dto.MessageDTO;
import com.socialmedia.entity.Message;
import com.socialmedia.mapper.MessageMapper;
import com.socialmedia.repository.MessageRepo;

@Service
public class IMessageimpl implements MessageService {
	@Autowired
	private MessageRepo messageRepo;
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public List<MessageDTO> GetMessage() {
		List<MessageDTO> listDTO = new ArrayList<>();
		List<Message> listEntity = messageRepo.findAll();
		for (Message item : listEntity) {
			listDTO.add(messageMapper.toDTO(item));
		}
		return listDTO;
	}

	@Override
	public List<MessageDTO> GetMessage(Pageable pageable) {
		List<MessageDTO> listDTO = new ArrayList<>();
		List<Message> listEntity = messageRepo.findAll(pageable).getContent();
		for (Message item : listEntity) {
			listDTO.add(messageMapper.toDTO(item));
		}
		return listDTO;
	}

	@Override
	public List<MessageDTO> SaveMessage(MessageDTO dto) {
		messageRepo.save(messageMapper.toEntity(dto));
		List<MessageDTO> listDTO = new ArrayList<>();
		List<Message> listEntity = messageRepo.findAll();
		for (Message item : listEntity) {
			listDTO.add(messageMapper.toDTO(item));
		}
		return listDTO;
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return (int) messageRepo.count();
	}

}
