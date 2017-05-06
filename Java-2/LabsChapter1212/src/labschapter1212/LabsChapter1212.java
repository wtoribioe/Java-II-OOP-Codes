/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1212;

public class LabsChapter1212 {

    public static void main(String[] args) {
      // java.io.File file  = new java.io.File("image/us.gif");
       java.io.File file  = new java.io.File("score1.txt"); //Use this slash because it is machine independent 
    // java.io.File file  = new java.io.File("C:\\Users\\Wilfrido\\Desktop\\Java-2\\LabsChapter1212\\image\\us.gif"); // this one is for windows only
        
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Parent is " + file.getParent());
        //System.out.println("Canonical path is " + file.getCanonicalPath());
        //System.out.println("List file is " + file.listFile());
        System.out.println("The name is " + file.getName());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        
    }
}
