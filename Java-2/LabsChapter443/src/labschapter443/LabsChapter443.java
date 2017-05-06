/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter443;

import java.util.Scanner;

public class LabsChapter443 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separate by spaces: " ); 
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();
        System.out.println("Entered str1 was " + str1); 
        System.out.println("Entered str2 was " + str2);
        System.out.println("Entered str3 was " + str3);
        
        System.out.println(" ");
        
        if (str1 == str2) {
            System.out.println("String1 and String2 are the same object (==)");
        }else
            System.out.println("String1 and String2 are different objects (==)");
        
        System.out.println(" ");
        
        if (str1.equals(str2)) {
            System.out.println("String1 and String2 are the same object (equals)");
        }else
            System.out.println("String1 and String2 are different objects (equals)");
        
        System.out.println(" ");
        
        if (str1.compareTo(str2) == 0){
            System.out.println("String1 and String2 are the same object (compareTo)");
        }else
            System.out.println("String1 and String2 are different objects (compareTo)");
   
   
 }
}
