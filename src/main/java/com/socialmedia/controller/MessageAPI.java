package com.socialmedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.controller.output.MessageOut;
import com.socialmedia.dto.MessageDTO;
import com.socialmedia.service.MessageService;

@RestController
public class MessageAPI {
	@Autowired
	private MessageService messageService;
	@GetMapping("/message")
	public ResponseEntity<?> getMessage(@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "limit", required = false) Integer limit) {
		MessageOut result = new MessageOut();
		Sort sort = Sort.by("sendDate").ascending();
		if(page !=null && limit != null) {
			result.setPage(page);
			Pageable pageable= PageRequest.of(page-1, limit, sort);
			result.setTotalPage((int) messageService.getTotalItem()/limit);
			result.setListResult(messageService.GetMessage(pageable));
		}
		else {
			result.setListResult(messageService.GetMessage());
		}
		return ResponseEntity.ok().body(result);
	}

	@PostMapping("/message")
	public List<MessageDTO> saveMessage(@RequestBody MessageDTO dto) {
		return messageService.SaveMessage(dto);
	}
}
