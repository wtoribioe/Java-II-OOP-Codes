/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletefile;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        String path = "C:/Users/Wilfrido/Desktop/Java-2/LabsChapter1213/score.txt";
    	try {
            File file = new File(path);
            if(file.delete()){
    		System.out.println(file.getName() + " is deleted!");
            }else {
    		System.out.println("Delete operation is failed.");
            }
    	}catch(Exception e){
    	}
    }
}