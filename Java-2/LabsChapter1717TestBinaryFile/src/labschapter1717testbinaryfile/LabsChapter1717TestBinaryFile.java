/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1717testbinaryfile;

import java.io.FileInputStream;
import java.io.IOException;

public class LabsChapter1717TestBinaryFile {
    public static void main(String[] args) {
       try (
            FileInputStream fis = new FileInputStream("test.dat");) {
               
    }
       catch (IOException ex) {
           ex.printStackTrace();
       }
    }
}
