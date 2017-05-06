/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreaderexample;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {

    public static void main(String[] args) {

        String csvFile = "C:/Users/Wilfrido/Desktop/Java-2/CVSFILES/country.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}