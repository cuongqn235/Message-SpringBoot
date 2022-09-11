package com.socialmedia.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Tags")
public class Tag extends BaseEntity {
	private String tag;
//	private User user;
//	private User userFollowing;
}
