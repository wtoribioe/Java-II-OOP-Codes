/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter124;

import java.util.Scanner;

public class LabsChapter124 {
    public static int quotient(int num1, int num2 ) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero"); 
        /* The "ArithmeticException" captured from the exception error message then used in the IF statement
        The THROW an Exception statenent like above will pass the exception from one place to another. It is analogous to a method call but instead of calling a method, it calls a CATCH BLOCK
        The TRY BLOCK is called to execute the code in normal circumstances. The exception is captured by the CATCH BLOCK
        The CATCH BLOCK is executed to handle the exception. After the CATCH BLOCK is executed, the program control does not return to THROW statement;
        insteat, it executes the next statement after the CATCH block. */
    }  
        return num1 / num2;
}
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     //Promt the user to enter two interger
     System.out.println("Enter two integers: ");
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     
     try { 
        int result = quotient(num1,num2);
        System.out.println(num1 + " / " + num2 + " is" + result); 
   }
     catch (ArithmeticException ex) {
        System.out.println("Exception: an integer " +
        "Cannot be divided by zero ");
     }
     System.out.println("Execution continue...." + "Executed after the CATCH BLOCK");
  }
}