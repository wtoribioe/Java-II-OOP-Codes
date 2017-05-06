/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1802recursive;

public class LabsChapter1802Recursive {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number");
        int index = input.nextInt();
        
    //Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }
    //The method for finding the Fiobonacci number
    public static long fib(long index) {
        if (index == 0) // Base case
            return 0;
        else if (index == 1) //base case)
            return 1;
        else //reducting and recursive calls
            return fib(index - 1) + fib(index - 2);    
    }
}
