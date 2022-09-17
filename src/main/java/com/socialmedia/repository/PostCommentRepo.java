package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmedia.entity.PostComment;

public interface PostCommentRepo extends JpaRepository<PostComment, Long>{

}
