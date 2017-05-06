/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1702testbinaryfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class LabsChapter1702TestBinaryFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (
        // Create an output stream for file temp.dat
        //try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat"))))
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        ){
        //Write Student est scores to the file
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeUTF("Jim");
        output.writeDouble(185.5);
        output.writeUTF("Gorge");
        output.writeDouble(105.5);
        output.writeUTF("kim");
        output.writeDouble(190.5);
        }
        try (
        // Create an input stream for file temp.dat
        //try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat"))))
        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
        ){
        // Read student test input score from the file
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        }
   } 
 }