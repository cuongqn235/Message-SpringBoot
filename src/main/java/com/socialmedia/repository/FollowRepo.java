package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.Follow;
@Repository
public interface FollowRepo extends JpaRepository<Follow, Long> {

}
