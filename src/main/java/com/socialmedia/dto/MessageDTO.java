package com.socialmedia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {
	private String reciverUserName;
	private String senderUserName;
	private String text;
	private Long sendDate;
}
