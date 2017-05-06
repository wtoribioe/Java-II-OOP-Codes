/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter125;
import java.util.*;

public class LabsChapter125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt(); //If the number entered is not an integer then control is transfered to the CATCH BLOCK
                
                //Display the result
                System.out.println("The number entered is " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine(); //Receive the new user entry to start over again
            }
        }while (continueInput);
    }
}
