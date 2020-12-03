package com.example.mondodb.mongo;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.mongodb.client.model.Filters.eq;


public class MongoService {



    public static void test() {
        MongoClient mongoClient = new MongoClient("mongo", 27017);
        MongoDatabase database = mongoClient.getDatabase("mydb");
        System.out.println(database.getName());

        MongoCollection<Document> collection = database.getCollection("test");
        Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));

        collection.insertOne(doc);

        Document answer = collection.find(eq("name", "MongoDB")).first();
        System.out.println(answer.get("versions"));
    }
}
