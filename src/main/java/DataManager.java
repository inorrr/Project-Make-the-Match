import org.bson.BsonObjectId;
import org.bson.types.BasicBSONList;

import com.mongodb.client.*;

import com.mongodb.client.model.Filters;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import org.bson.types.ObjectId;
import org.bson.BsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataManager {
    private static final ConnectionManager connectionManager = new ConnectionManager();

    public DataManager(){}

    public static boolean addData(String type, String title, String director, String cast, String country,
                                  String releasedYear, String duration, String genere, String description)
    {
        Document newDoc = new Document("type", type)
                .append("title", title)
                .append("director", director)
                .append("cast", cast)
                .append("country", country)
                .append("releasedYear", releasedYear)
                .append("duration", duration)
                .append("genere", genere)
                .append("description", description);

        connectionManager.getCollection("Production").insertOne(newDoc);

        return true;
    }

//    public static List<String> getData(String type, String title, String director, String cast, String country,
//                                       String releasedYear, String duration, String genere, String description){
//
//    }


}

//        MongoDatabase db = client.getDatabase("database1");
//
//        MongoCollection col = db.getCollection("Production");
//
//        Document sampleDoc = new Document("_id", 1).append("name", "Inor");
//
//        col.insertOne(sampleDoc);
