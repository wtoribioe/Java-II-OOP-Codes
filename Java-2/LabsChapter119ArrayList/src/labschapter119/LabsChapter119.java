/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter119;
import java.util.ArrayList;
import java.util.Scanner;
        
public class LabsChapter119 {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integers (input END with 0): ");
        int value;
        
        do {
            value = input.nextInt(); //Read a value from the input
            
            if (!integerList.contains(value) && value != 0)
                integerList.add(value); //Add the value if it is not in the list
        } while (value != 0);
        
        //Display the distinct numbers
         System.out.print(integerList);
         System.out.println(" ");
         
         //Display the distinct numbers using for loop
        System.out.println("Using For Loop :");
        for (int i = 0; i <= integerList.size() - 1; i++)
            System.out.print(integerList.get(i) + " ");
        
        //Display the distinct numbers using foreach loop
        System.out.println("Using Foreach Loop :");
        for (Integer el: integerList)
            System.out.print(el + " ");
    }
}
