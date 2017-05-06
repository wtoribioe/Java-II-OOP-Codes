/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter416;

import java.util.Scanner;

public class Labschapter416 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter String 1 :");
        String str1 = input.nextLine();
        System.out.println("Enter String 2 :");
        String str2 = input.nextLine();
        System.out.println("Enter String 3 :");
        String str3 = input.nextLine();
        
        System.out.println(" ");
        boolean val1 = str1 == str2;
        System.out.println("Str1 == Str2: " +val1);
        System.out.println(" ");
        
        boolean val2 = str2 == str3;
        System.out.println("Str1 == str3: " + val2);
        System.out.println(" ");
        
        boolean val3 = str1.equals(str2);
        System.out.println("Str1.equals(str2: )" + val3);
        System.out.println(" ");
        
        boolean val4 = str1.equals(str3);
        System.out.println("Str1.equals(str3): " + val4);
        System.out.println(" ");
        
        // comparing str1 and str2
        int retval = str1.compareTo(str2);
        // prints the return value of the comparison
         if (retval < 0) {
            System.out.println("str1.compareTo(str2) str1 is greater than str2");
         } else if (retval == 0) {
             System.out.println("str1.compareTo(str2) str1 is equal to str2");
         } else {
            System.out.println("str1.compareTo(str2) str1 is less than str2");
        }
        System.out.println(" ");
        
        // comparing str1 and str2
        int retval22 = str1.compareTo(str3);
        // prints the return value of the comparison
         if (retval22 < 0) {
            System.out.println("str1.compareTo(str3) str1 is greater than str3");
         } else if (retval22 == 0) {
             System.out.println("str1.compareTo(str3) str1 is equal to str3");
         } else {
            System.out.println("str1.compareTo(str3) str1 is less than str3");
        } 
         System.out.println(" ");
         
        // comparing str1 and str2
        int retval2 = str2.compareTo(str3);
        // prints the return value of the comparison
         if (retval2 < 0) {
            System.out.println("str2.compareTo(str3) str2 is greater than str2");
         } else if (retval2 == 0) {
             System.out.println("str2.compareTo(str3) str2 is equal to str2");
         } else {
            System.out.println("str2.compareTo(str3) str2 is less than str2");
        } 
         System.out.println(" ");
         
        // comparing str2 and str2
        int retval3 = str2.compareTo(str2);
        // prints the return value of the comparison
         if (retval3 < 0) {
            System.out.println("str2.compareTo(str2) str2 is greater than str2");
         } else if (retval3 == 0) {
             System.out.println("str2.compareTo(str2) str2 is equal to str2");
         } else {
            System.out.println("str2.compareTo(str2) str2 is less than str2");
        } 
         System.out.println(" ");
         
        char retval4 = str1.charAt(0); 
        System.out.println("Str1 charAt(0) is: " + retval4);
        System.out.println(" ");
        
        int retval5 = str1.indexOf("j");
        System.out.println("Str1.indexOf(\"j\") is: " + retval5);
        System.out.println(" ");
        
        int retval55 = str1.indexOf("J");
        System.out.println("Str1.indexOf(\"j\") is: " + retval55);
        System.out.println(" ");
        
        
        int retval6 = str1.indexOf("to");
        System.out.println("Str1.indexOf(\"to\") is: " +retval6);
        System.out.println(" ");
        
        int retval7 = str1.lastIndexOf("a");
        System.out.println("Str1.lastIndexOf(\"a\") is: " + retval7);
        System.out.println(" ");
        
        int retval8 = str1.lastIndexOf("o",15);
        System.out.println("Str1.lastIndexOf(\"o\", 15) is: " + retval8);
        System.out.println(" ");
        
        int retval9 = str1.length();
        System.out.println("Str1.length() is: " + retval9);
        System.out.println(" ");
        
        String retval10 = str1.substring(5);
        System.out.println("Str1.substring(5) is: " + retval10);
        System.out.println(" ");
        
        String retval100 = str1.substring(5,11);
        System.out.println("Str1.substring(5,11) is: " + retval100);
        System.out.println(" ");
        
        boolean retval11 = str1.startsWith("Wel");
        System.out.println("Str1.startsWith(\"Wel\") is: " + retval11);
        System.out.println(" ");
        
        boolean retval111 = str1.endsWith("Java");
        System.out.println("Str1.endsWith(\"java\") is: " + retval111);
        System.out.println(" ");
      
        String retval12 = str1.toLowerCase();
        System.out.println("Str1.toLowerCase() is: " + retval12);
        System.out.println(" ");
        
        String retval13 = str1.toUpperCase();
        System.out.println("str1.toUpperCase() is: " + retval13);
        System.out.println(" ");
        
        String retval14 = str1.concat(str2);
        System.out.println("Str1.concat(str2) is: " + retval14);
        System.out.println(" ");
        
        boolean retval144 = str1.contains(str2);
        System.out.println("Str1.contains(str2) is: " + retval144);
        System.out.println(" ");
       
        System.out.println("\t Wel \t".trim());
        System.out.println(" ");
    }
    
}
