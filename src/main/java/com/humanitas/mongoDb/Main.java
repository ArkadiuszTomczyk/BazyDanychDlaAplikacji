package com.humanitas.mongoDb;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
        public static void main(String [] args) {
            String uri = "mongodb+srv://Wiktor:wiktor@cluster0.cwbcnyc.mongodb.net/?retryWrites=true&w=majority";
            MongoClient client = MongoClients.create(uri);
            MongoDatabase database = client.getDatabase("java");
//            MongoCollection col1 = database.getCollection("cwiczenie1");
            MongoCollection col2 = database.getCollection("cwiczenie2");
            MongoCollection col3 = database.getCollection("cwiczenie3");
            MongoCollection col4 = database.getCollection("cwiczenie4");
//            Document first = new org.bson.Document("_id", 1)
//                    .append("imie", "Adrian")
//                    .append("nazwisko", "Andrus")
//                    .append("miasto", "Abramów");
//            col1.insertOne(first);
//            Document second = new org.bson.Document("_id", 2)
//                    .append("imie", "Wiktor")
//                    .append("nazwisko", "Witkacy")
//                    .append("miasto", "Władywostok");
//            col1.insertOne(second);
//            Document third = new org.bson.Document("_id", 3)
//                    .append("imie", "Barbara")
//                    .append("nazwisko", "Bawół")
//                    .append("miasto", "Babieszyce");
//            col1.insertOne(third);

            List<Document> mojaLista = Arrays.asList(
                    new Document("_id", 1)
                            .append("Marka ", "LIAZ")
                            .append("Model", "PLKJHG"),
                    new Document("_id", 2)
                            .append("Marka", "Audi")
                            .append("Model", "A6"),
                    new Document("_id", 3)
                            .append("Marka", "MAN")
                            .append("Model", "CT640"));
            col2.insertMany(mojaLista);

            List<Document> hitLista = Arrays.asList(
                    new Document("_id", 1)
                            .append("Marka ", "Żuk")
                            .append("Model", "Blaszak"),
                    new Document("_id", 2)
                            .append("Marka", "Fiat")
                            .append("Model", "500"),
                    new Document("_id", 3)
                            .append("Marka", "Ford")
                            .append("Model", "KA"));
            col3.insertMany(hitLista);
            List<Document> takaSeLista = Arrays.asList(
                    new Document("_id", 1)
                            .append("Marka ", "FSO")
                            .append("Model", "Polonez"),
                    new Document("_id", 2)
                            .append("Marka", "Fiat")
                            .append("Model", "124"),
                    new Document("_id", 3)
                            .append("Marka", "Ford")
                            .append("Model", "GT"));
            col4.insertMany(takaSeLista);


        }
        Logger logger = LoggerFactory.getLogger("MyApp");
}
