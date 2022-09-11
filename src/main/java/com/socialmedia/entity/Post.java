package com.socialmedia.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Posts")
public class Post extends BaseEntity {
	private String title;
	private String content;
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date datePublished;
//	private User user;
}
