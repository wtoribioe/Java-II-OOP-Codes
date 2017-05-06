/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryrenamedemoa;

import java.io.File;
import java.util.Scanner;

public class DirectoryRenameDemoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the path of directory to rename.");
	String dirPath = scanner.nextLine();
	File dir = new File(dirPath);
	
        if (!dir.isDirectory()) {
            System.err.println("There is no directory @ given path");
            System.exit(0);
        }
 
	System.out.println("Enter new name of directory(Only Name and Not Path).");
	String newDirName = scanner.nextLine();
 
	File newDir = new File(dir.getParent() + "\" + newDirName");
	dir.renameTo(newDir);
 
	System.out.println("Done");
	}
    }
    
