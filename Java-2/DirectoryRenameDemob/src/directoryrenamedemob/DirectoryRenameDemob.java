/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoryrenamedemob;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DirectoryRenameDemob {
    public static void main(String[] args) {
	Path source = Paths.get("C:/Temp/Exercise00");
	Path target = Paths.get("C:/Temp/Exercise00");
	try {
            //replace existing file using java nio package
            System.out.println(Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING));
	} catch (IOException e) {
            e.printStackTrace();
	}
   }
}