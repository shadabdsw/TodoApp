package com.shadab.DB;

import java.nio.file.DirectoryStream.Filter;
import java.util.Iterator;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class tododb {

    MongoClient client = new MongoClient("localhost", 27017);
    MongoDatabase database = client.getDatabase("todoDB");
    MongoCollection<Document> collection = database.getCollection("todoList");

    public void add(String key, String value) {
        collection.insertOne(new Document(key, value));
    }

    public String[] getAllDocuments() {
        Iterator it = collection.find().iterator();
        int counter = 0;
        String[] arr = new String[100];
        while (it.hasNext()) {
            Document doc = (Document) it.next();
            String s = doc.getString("todo");
            arr[counter] = s;
            counter++;
        }
        return arr;
    }
}
