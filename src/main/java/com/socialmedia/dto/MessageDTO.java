  package com.socialmedia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {
	private String reciverUserName;
	private String senderUserName;
	private String text;
	private Long sendDate;
}
