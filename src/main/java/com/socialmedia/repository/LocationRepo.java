package com.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socialmedia.entity.Location;
@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {
	
}
