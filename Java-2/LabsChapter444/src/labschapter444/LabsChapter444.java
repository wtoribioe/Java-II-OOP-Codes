/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter444;

import java.util.Scanner;

public class LabsChapter444 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter the first City: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second City: ");
        String city2 = input.nextLine();
        
        if ((city1.compareTo(city2)) < 0) {
            System.out.println("The cities in alphabetical order are " + city1 + ", " + city2);
        }else
            System.out.println("The cities in alphabetical order are " + city2 + " , " + city1);
        
    }
    
}
