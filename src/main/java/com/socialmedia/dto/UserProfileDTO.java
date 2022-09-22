package com.socialmedia.dto;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDTO {
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthDay;
	private String occupation;
	private String about;
	private Date dateUpdated;
	private LocationDTO locationDTO;
}
