package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmedia.entity.Follow;

public interface FollowRepo extends JpaRepository<Follow, Long> {

}
