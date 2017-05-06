/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkingpractice4;

public class TestKingPractice4 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        for (int i : list) {
             System.out.println(i + " "); //This is the correct one
           // System.out.println(list[i] + " ");  // Print the arry however throw an error Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        }  
      //  for (int i2=0; ii <= list.length - 1; ii++) {
       //     System.out.println(list[i2 + " "]); //This is the correct one
       // }
    }
}