package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.User;
import com.socialmedia.entity.UserProfile;
@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile, Long>{
	public UserProfile findByUser(User user);
}
