/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryfiledemob;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryFileDemob {
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("How many folders do you want?: ");
       
        int numberOFolders = input.nextInt();
        String dirPath = "C:/Temp/";
        String folderName = "Exercise0";
    
        int i = 0;
        do {
            System.out.println(folderName + i);
            try {
                Files.createDirectories(Paths.get(dirPath + folderName + i));
                i++;
            }catch(FileAlreadyExistsException e){
                System.err.println("Folder already exists");
            }
        }while(numberOFolders > i);
     }
}

/*
Path source = Paths.get("C:\\Artwork\\Dir1");
Path newDir = Paths.get("C:\\Artwork\\Dir2");
Files.move(source, newDir,StandardCopyOption.ATOMIC_MOVE); //Throwed AccessDeniedException
Files.move(source, newDir,StandardCopyOption.REPLACE_EXISTING); //Throwed DirectoryNotEmptyException
*/