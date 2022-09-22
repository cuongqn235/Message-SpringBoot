package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.PostComment;
@Repository
public interface PostCommentRepo extends JpaRepository<PostComment, Long>{

}
