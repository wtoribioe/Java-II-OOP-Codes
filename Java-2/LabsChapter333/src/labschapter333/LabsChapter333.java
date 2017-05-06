/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter333;

import java.util.Scanner;

public class LabsChapter333 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter double value for x,y and z: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        
        System.out.println((x < y && y < z) ? "Sorted" : "Unsorted");  
        
        
    }
    
}
