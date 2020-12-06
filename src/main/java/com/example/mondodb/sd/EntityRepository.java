package com.example.mondodb.sd;

import com.example.mondodb.mongo.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EntityRepository extends MongoRepository<Entity, Long> {

    Optional<Entity> findByName(String name);
}
