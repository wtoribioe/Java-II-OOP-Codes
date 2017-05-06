/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter121;

import java.util.Scanner;

public class LabsChapter121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter two integers
        System.out.println("Enter two itegers: ");
        int num11 = input.nextInt();
        int num22 = input.nextInt();
        
        float num1 = (float)num11; //Division by 0 is allow but print out 0.0 infinity
        float num2 = (float)num22;//Division by 0 is allow but print out 0.0 infinity
        
        System.out.println(num1 + " / " + num2 + " is "+ (num1 / num2));
        
        System.out.println(num11 + " / " + num22 + " is "+ (num11 / num22));
        
        
    }
}
