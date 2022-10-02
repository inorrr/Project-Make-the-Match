import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.Scanner;
import java.util.List;

public class ReadCSV {

    public ReadCSV(){}

    public static void read(String path){
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(path)).withSkipLines(1).build();

            List<String[]> myEntries = reader.readAll();

            for (String[] entry : myEntries) {
                String type = entry[1];
                String title = entry[2];
                String director = entry[3];
                String cast = entry[4];
                String country = entry[5];
                String releasedYear = entry[7];
                String duration = entry[9];
                String genere = entry[10];
                String description = entry[11];
                DataManager.addData(type, title, director, cast, country, releasedYear, duration, genere, description);
            }
        }catch(IOException | CsvException ex){
            System.out.println("File not found.");
        }
    }


    public static void main(String[] agrs) throws Exception
    {
    }


}
