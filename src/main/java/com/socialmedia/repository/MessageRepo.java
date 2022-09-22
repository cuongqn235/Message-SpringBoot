package com.socialmedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.Message;
import com.socialmedia.entity.User;
@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {
	public List<Message> findAllByReciver(User user);
}
