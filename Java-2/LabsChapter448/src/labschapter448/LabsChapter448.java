/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter448;

import java.util.Scanner;

public class LabsChapter448 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter the string numeric value ");
        String strValue = input.nextLine();
        System.out.println(" ");
        
        double dubleValue = Double.parseDouble(strValue);
        System.out.println("The value Parsed to Double  was:  " + dubleValue/100);
        System.out.println(" ");
     
        int intValue = Integer.parseInt(strValue);
        System.out.println("The value Parsed to Integer was:  " + intValue);
        System.out.println(" ");
   
    }
    
}
