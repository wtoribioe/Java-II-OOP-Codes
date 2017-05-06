/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter463;

public class Labschapter463 {

    public static void main(String[] args) {
        int num = 1;
        System.out.printf("%5d %d\n",1, 2, 3);  //only 1 and 2 are displayed after 45 spaces from the left to right
        System.out.printf("%5d %f\n",1);   //Only 1 is displayed and program has runtime error
        System.out.printf("%5d %f",1,2);  //Only 1 is displayed and program has runtime error
        
        System.out.printf("amount is %f %e\n", 32,32,32);  // runtime error
        System.out.printf("amount is %5.2%% %5.4e\n", 32,327,32,32); //runtime error
        System.out.printf("%6b\n", (1 > 2));  //False
        System.out.printf("%6s\n", "Java");  //output Java 6spaces to the right justified
        System.out.printf("%-6b%s\n", (1 > 2), "Java"); // output false java
        System.out.printf("%6b-8s\n", (1 > 2), "Java"); //output  false 8s
        System.out.printf("%6b%8s\n", (1 > 2), "Java"); //output false  Java
    }
}
