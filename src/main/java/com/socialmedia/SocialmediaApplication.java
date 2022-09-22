package com.socialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialmediaApplication{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("StringBuffer");
		s.append(" hello 2");
		System.out.println(s);
		SpringApplication.run(SocialmediaApplication.class, args);
	}
}
