/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter122;

import java.util.Scanner;

public class LabsChapter122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter two integers
        System.out.println("Enter two itegers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        if (num2 != 0)
            System.out.println(num1 + " /" + num2 + " is "+ (num1 / num2));
        else
            System.out.println("Divisor cannot be zero ");
    }
}
