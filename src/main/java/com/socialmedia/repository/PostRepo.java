package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.Post;
@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

}
