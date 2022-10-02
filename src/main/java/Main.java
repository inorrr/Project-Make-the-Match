import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args){

//        MongoClient client = MongoClients.create("mongodb+srv://inorrr:ERsHIYPyEMDd45A5@cluster0.xudcrzy.mongodb.net/?retryWrites=true&w=majority");
//
//        MongoDatabase db = client.getDatabase("database1");
//
//        MongoCollection col = db.getCollection("Production");
//
//        Document sampleDoc = new Document("_id", 1).append("name", "Inor");
//
//        col.insertOne(sampleDoc);
//        Celebrity c1 = new Celebrity("Emma", "Watson");
//        DataManager.addData("Harry Potter", "Emma Watson");
        ReadCSV.read("/Users/yinuozhao/IdeaProjects/make_the_match/src/main/resources/netflix_titles.csv");
    }
}
