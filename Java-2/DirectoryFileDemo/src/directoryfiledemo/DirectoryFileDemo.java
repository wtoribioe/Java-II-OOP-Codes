/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryfiledemo;

import java.io.File;

public class DirectoryFileDemo {   
    public static void main(String[] args) {
       
      File file = null;
      boolean bool = false;
      try{      
        // returns pathnames for files and directory
        file = new File("C:/Users/Wilfrido/Desktop/Java-2/DirectoryFile-Test/Exercise");
        // create directories
        bool = file.mkdirs();
         
        // print
        System.out.println("Directory created? " + bool);
        
         
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }
}
