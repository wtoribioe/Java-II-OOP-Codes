/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1705testobjectfile;

import java.io.BufferedOutputStream;
import static java.io.FileDescriptor.out;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabsChapter1705TestObjectFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create an output stream for file object.dat
        // ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.dat")));
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
        ){
        // Write a string double value, and object to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }    
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        ){
           System.out.println(input.readUTF());
           System.out.println(input.readDouble());
           java.util.Date date = (java.util.Date)(input.readObject());
           System.out.println(date);
        }
    }
}
