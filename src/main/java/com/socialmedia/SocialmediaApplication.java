package com.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.socialmedia.entity.User;
import com.socialmedia.repository.UserRepo;

@SpringBootApplication
public class SocialmediaApplication{

	public static void main(String[] args) {
		SpringApplication.run(SocialmediaApplication.class, args);
	}
}
