/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1733testobjectfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class LabsChapter1733TestObjectFile {

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("test.dat","r");){
            int i = raf.readInt();
        }
        catch (IOException ex) {
            System.out.println("IO exeception");
        }
    }
}
