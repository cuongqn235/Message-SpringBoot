package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
