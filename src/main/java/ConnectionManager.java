import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

public class ConnectionManager{

    private static final String username = "inorrr";
    private static final String password = "ERsHIYPyEMDd45A5";
    private static final String uri = String.format("mongodb+srv://%s:%s@cluster0.xudcrzy.mongodb.net/?retryWrites=true&w=majority",
            username, password);

    private MongoClient client;
    private MongoDatabase database;
    private HashMap<String, MongoCollection> collections;

    public ConnectionManager(){
        try{
            client = MongoClients.create(uri);
            database = client.getDatabase("make_the_match");
            collections = new HashMap<String, MongoCollection>();

            collections.put("Production", database.getCollection("Production"));

        } catch (MongoException me){
            System.err.println("An error occurred while attempting to run a command: " + me);
        }
    }

    public MongoCollection getCollection(String collectionName){return collections.get(collectionName);}


}


