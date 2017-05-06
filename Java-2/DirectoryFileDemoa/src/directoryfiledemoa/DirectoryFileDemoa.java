/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryfiledemoa;

import java.io.File;

/**
 *
 * @author Wilfrido
 */
public class DirectoryFileDemoa {
    public static void main(String[] args) {
       String dirPath = "C:/Temp";
       File dir = new File(dirPath);

        // Get Directory Listing
        File[] fileList = dir.listFiles();

        // Process each file
        for(int i = 0; i < fileList.length; i++){
            if(fileList[i].isFile()) {
                 String fileName = fileList[i].getName();
                 // Split at the file extension and the classgroup
                 String[] fileParts = fileName.split("[_\\.]");
                 System.out.println("One: " + fileParts[i] + ", Two: " + fileParts[i]);

                // Check directory exists
                File newDir = new File(dirPath + fileParts[i] + "\\" + fileParts[i]);
            if(!newDir.exists()) {
                // Create directory
                if(newDir.mkdirs()) {
                    System.out.println("Directory Created");
                }
            } 

            // Move file into directory
            if(fileList[i].renameTo(new File(dirPath + fileParts[0] + "\\" + fileParts[1] + "\\" + fileName))) {
                System.out.println("File Moved");
            }

        }
    }
  }
}