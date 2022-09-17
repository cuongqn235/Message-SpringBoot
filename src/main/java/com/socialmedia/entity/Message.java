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
@Table(name="Messages")
public class Message extends BaseEntity {
	@ManyToOne 
    @JoinColumn(name = "reciver_id")
	private User reciver;
	@ManyToOne 
    @JoinColumn(name = "sender_id")
	private	User sender;
	private String text;
	@Temporal(TemporalType.TIMESTAMP)
	private Date sendDate;
}
