package com.hopper.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hopper.project.services.S3Service;

@SpringBootApplication
public class SystemApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Oneiros\\Downloads\\Dagon.jpg");
	}
	
}
