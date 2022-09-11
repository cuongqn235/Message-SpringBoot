package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.Message;
@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
	
}
