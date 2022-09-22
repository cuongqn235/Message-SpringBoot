package com.socialmedia.dto;

import org.springframework.http.ResponseEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepositoryData {
	private ResponseEntity<?> data;
}
