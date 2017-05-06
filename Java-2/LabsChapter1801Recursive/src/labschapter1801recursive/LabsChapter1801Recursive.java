/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1801recursive;

import java.util.Scanner;

public class LabsChapter1801Recursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int n = input.nextInt();
        
        //Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    //Return the factorial for the specified number
    public static long factorial(int n) {
        if (n == 0) //Base case
            return 1;
          else
            return n * factorial(n-1); //Recursive call
    }
}
