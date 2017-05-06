/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter418;

import java.util.Scanner;

public class Labschapter418 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.println("Enter String 1 :");
        String str1 = input.nextLine();
        System.out.println("Enter String 2 :");
        String str2 = input.nextLine();
        System.out.println("Enter String 3 :");
        String str3 = input.nextLine();
         
        String str4 = str1 + str2;
        System.out.println("Str1 + Str2 is: " + str4);
        System.out.println(" ");
        
        String str5 = str1 - str2;
        System.out.println("Str1 - Str2 is: " + str5);
        System.out.println(" ");
        
        boolean str6 = str1 == str2;
        System.out.println("Str1 - Str2 is: " + str6);
        System.out.println(" ");
        
        boolean str7 = str1 >= str2;
        System.out.println("Str1 - Str2 is: " + str7);
        System.out.println(" ");
        
        // comparing str1 and str2
        int retval22 = str1.compareTo(str2);
        // prints the return value of the comparison
         if (retval22 < 0) {
            System.out.println("str1.compareTo(str3) str1 is greater than str3");
         } else if (retval22 == 0) {
             System.out.println("str1.compareTo(str3) str1 is equal to str3");
         } else {
            System.out.println("str1.compareTo(str3) str1 is less than str3");
        } 
         System.out.println(" ");
         int i = str1.length();
         System.out.println(i);
         
         char c = str1(10);
         char cc = str1.charAt(str1.length());
         
    }
    
}
