package com.example.mondodb;

import com.example.mondodb.mongo.MongoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MondodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MondodbApplication.class, args);
		MongoService.test();
	}

}
