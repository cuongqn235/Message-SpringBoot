package com.socialmedia.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="FollowingRelationships")
public class Follow extends BaseEntity {
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFollowed;
	@ManyToOne 
    @JoinColumn(name = "user_id")
	private User user;
	@ManyToOne 
    @JoinColumn(name = "follower_id")
	private	User follower;
}
