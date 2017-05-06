/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1718testbinaryfile;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LabsChapter1718TestBinaryFile {
    public static void main(String[] args) throws java.io.IOException{
        try (java.io.PrintWriter output = new java.io.PrintWriter("text.txt");) {
            output.printf("%s", "1234");
            output.printf("%s", "5678");
            output.close();
            
        }
    }
}
