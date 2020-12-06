package com.example.mondodb;

import com.example.mondodb.mongo.Entity;

import com.example.mondodb.sd.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;

@ComponentScan(basePackages = "com.example.mondodb.mongo")
@SpringBootApplication
@EnableAutoConfiguration
public class MondodbApplication implements CommandLineRunner {

	@Autowired
	private EntityRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MondodbApplication.class, args);
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
		//MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		//MongoDBPOperations manager = ctx.getBean(MongoDBPOperations.class);

	}

	@Override
	public void run(String... args) throws Exception {
		Entity first = new Entity("first", 1);
		Entity second = new Entity("second", 2);

		repository.save(first);
		repository.save(second);
		System.out.println("Entity have been saved!");

		Entity result = repository.findByName("first").get();
		System.out.println("The age of the first entity is: " +
				result.getAge());
	}
}
