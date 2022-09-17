package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmedia.entity.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

}
