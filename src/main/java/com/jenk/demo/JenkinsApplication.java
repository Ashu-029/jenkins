package com.jenk.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	
	private static final Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public  init() {
		logger.info("Application Started Again.... ");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	    logger.info("Application Executed... ");
		System.out.println("Ashish");
	}

}
