/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryrenamedemo;
import java.io.*;

public class DirectoryRenameDemo {
    public static void main(String[] args) {
     
        File dir = new File("C:/Temp/Exercise");
        File newName = new File("C:/Temp/Exercise000");
    
        if (dir.isDirectory()) {
            dir.renameTo(newName);
        } else {
            dir.mkdir();
            dir.renameTo(newName);
        }
    }
}
