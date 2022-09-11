package com.socialmedia.controller.output;

import java.util.ArrayList;
import java.util.List;

import com.socialmedia.dto.MessageDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageOut {
	private int page;
	private int totalPage;
	private List<MessageDTO> listResult = new ArrayList<>();
}
