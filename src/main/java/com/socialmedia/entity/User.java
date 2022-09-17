package com.socialmedia.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name="Users")
public class User extends BaseEntity {
	@Column(nullable = true)
	private String username;
	private String email;
	private String password;
	@Temporal(TemporalType.TIMESTAMP)
	private Date  dateRegistered;
	private String accountStatus;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private UserProfile userProfile;
	@OneToMany(mappedBy = "reciver", cascade = CascadeType.ALL)
    private List<Message> recive;
	@OneToMany(mappedBy = "sender", cascade = CascadeType.ALL)
    private List<Message> send;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Follow> listFriend;
	@OneToMany(mappedBy = "follower", cascade = CascadeType.ALL)
    private List<Follow> followers;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;
}
