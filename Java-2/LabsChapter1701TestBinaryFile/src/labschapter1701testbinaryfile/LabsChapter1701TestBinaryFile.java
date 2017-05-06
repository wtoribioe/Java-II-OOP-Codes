/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1701testbinaryfile;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class LabsChapter1701TestBinaryFile {
    public static void main(String[] args) throws  IOException {
        try (
        //Create an output stream to the file
        FileOutputStream output = new FileOutputStream("temp.dat");
        ) {
        // Write value to the file
        for (int i = 1; i <= 10; i++)
            output.write(i);
        }
        try (
        // Create a input stream for the file
        FileInputStream input = new FileInputStream("temp.dat"); 
        ) {
        // Read values from the file
        int value;
        while ((value = input.read()) != -1)
            System.out.print(value + " ");
        System.out.println(" ");
        }
    }
}
