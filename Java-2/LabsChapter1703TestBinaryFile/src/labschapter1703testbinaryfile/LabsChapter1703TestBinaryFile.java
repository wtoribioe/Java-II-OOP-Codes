/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1703testbinaryfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

//Default Buffer size is 512

public class LabsChapter1703TestBinaryFile {
    public static void main(String[] args)throws FileNotFoundException, IOException  {
      try {
        //try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat")));
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
        }
        //try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat")));
        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
            while (true)
                System.out.println(input.readDouble());
        }
    }
        catch (EOFException ex) {
                System.out.println("All were read");
    }
        catch (IOException ex) {
                ex.printStackTrace();
       }
   }
}