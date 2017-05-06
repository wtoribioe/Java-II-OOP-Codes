/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1024;

public class LabsChapter1024 {

    public static void main(String[] args) {
        System.out.println("Hi, ABC, good".matches("Hi, ABC, good"));
        System.out.println("Hi, ABC, good".matches("ABC"));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C, good".replaceAll(",;","#"));
        System.out.println("A,B;C, good".replaceAll("[,;]","#"));
  
        System.out.println(" ");
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
        System.out.print(tokens[i] + " ");
    }
}
