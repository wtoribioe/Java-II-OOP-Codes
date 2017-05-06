/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter15javafxreadingfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LabsChapter15JavaFXReadingFiles {
    public static void main(String[] args) {
        String path = "wilfridojavafxbasicpickfourcards/image/card/";
        File[] files = new File(path).listFiles();
        
        for (File file : files) {
            if (!file.isFile()) continue;
            String[] bits = file.getName().split(".");
            if(bits.length > 0 && bits[bits.length - 1].equalsIgnoreCase("png"));
            System.out.println(file.getName());
        }
    }
    
}