package com.twitterWeb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.twitterWeb"})
public class TwitterWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterWebServiceApplication.class, args);
	}

}

