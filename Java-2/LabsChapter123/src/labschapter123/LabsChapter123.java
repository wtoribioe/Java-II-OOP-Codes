/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter123;
import java.util.Scanner;

public class LabsChapter123 {
    public static int quotient(int num1, int num2 ) {
        if (num2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
    }
    return num1 / num2;
}
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     //Promt the user to enter two interger
     System.out.println("Enter two integers: ");
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     
     int result = quotient(num1,num2);
     System.out.println(num1 + " / " + num2 + " is " + result); 
   }
}