package FileReadOperations;

import java.io.*;
import java.time.LocalDate;

/*
    Given a text file with dates such that a new date in each line.
    Write a Java code to delete first N dates and add next N dates starting from today in the file.
 */

public class RemoveAndAddNDates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\dates.txt"));

        String line="";
        int N =3;

        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\dates.txt", true));

        LocalDate date = LocalDate.now();
        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(date.plusDays(i)));
            bw.newLine();
        }
        bw.close();

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\dates.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\adilk\\OneDrive\\Desktop\\practice springboot\\ReactiveProjectFlux\\mspractice\\src\\main\\java\\FileReadOperations\\testData\\output.txt"));

        String line1="";
        while ((line1= br1.readLine())!=null) {
            if(N>0) {
                N--;
            }
            else {
                writer.write(line1);
                writer.newLine();
            }
        }
        writer.close();
    }
}
