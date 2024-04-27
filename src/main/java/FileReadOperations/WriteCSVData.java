package FileReadOperations;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteCSVData {
    public static void main(String[] args) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\sample1.csv"));

         String set1[] = {"id", "name", "account"};
         String set2[] = {"1", "Adil", "MS"};
         String set3[] = {"2", "Abhishek", "MS"};
         String set4[] = {"3", "Sana", "GS"};
         String set5[] = {"4", "Adyan", "GS"};
         String set6[] = {"5", "Vidya", "Accolite"};

         writer.writeAll(List.of(set1,set2,set3,set4,set5,set6));

         //flush data to create csv file
        writer.flush();
        System.out.println("Created csv successfully...");
        BufferedReader reader = null;

        String line="";

        try {

            reader = new BufferedReader(new FileReader("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\sample1.csv"));
            while ((line= reader.readLine())!=null) {
                String []row = line.split(",");

                for(String s:row) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            reader.close();
        }

    }
}
