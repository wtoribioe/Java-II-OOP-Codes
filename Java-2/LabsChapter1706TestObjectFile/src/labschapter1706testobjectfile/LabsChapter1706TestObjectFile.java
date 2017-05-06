/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1706testobjectfile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabsChapter1706TestObjectFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // Create an input stream for the file object.dat
       // ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.dat")));
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        ){
        // Write a string double value, and object to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }    
       try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
       ){
       // Read a string, double value, and object from the file
       String name = input.readUTF();
       double score = input.readDouble();
       java.util.Date date = (java.util.Date)(input.readObject());
       System.out.println(name + " " + score + " " + date);
       }
    }
    
}
