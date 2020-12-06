package com.example.mondodb.mongo;

import com.example.mondodb.sd.EntityRepository;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class MongoDBPOperations {

//    public void saveEntity(EntityRepository mongoOperation, Entity entity) {
//
//        mongoOperation.save(entity);
//        System.out.println("Entity saved successfully");
//        // entity has been created with id.
//        System.out.println("entity : " + entity);
//    }
//
//    public void searchEntity(EntityRepository mongoOperation, String criteria,String value) {
//        // query to search entity
//        Query searchEntity = new Query(Criteria.where(criteria).is(value));
//
//        // find Entity based on the query
//        //Entity resultEntity = mongoOperation.findOne(searchEntity, Entity.class);
//        Entity resultEntity = mongoOperation.findByName("first");
//        System.out.println("Entity found!!");
//        System.out.println("Entity details: " + resultEntity);
//    }
}
