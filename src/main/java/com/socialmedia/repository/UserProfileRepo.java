package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmedia.entity.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, Long>{

}
