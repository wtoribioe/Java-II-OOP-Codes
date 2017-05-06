/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.IOException;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) throws IOException {
        Scanner intro = new Scanner(System.in);
        
        java.io.File file = new java.io.File("Salary");
        Scanner input = new Scanner(file);
        int x = 0; int y = 0;
        
        //Capturing the eployee info
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
                if (x != 99) {
                     while (y <= 99 )  {
                     System.out.println("Employee Frist Name: ");
                     String firstName = intro.next();
                     System.out.println("Employee Last Name: ");
                     String lastName = intro.next();
                     System.out.println("Employee Gender: ");
                     String gender = intro.next();
                     System.out.println("Employee salary: ");
                     double salary = intro.nextDouble();
                     System.out.println("enter digit E to finish or enter to continue");
                     double option = intro.nextDouble();
                     y++;
                     // Writing the file
                    output.print(firstName);
                    output.print(lastName);
                    output.print(gender);
                    output.print(salary);
                     }
                      //Close file
         System.out.println("Is it absolute? " + file.getAbsolutePath());
        System.out.println("The file has " + file.length() + " bytes");
        output.close();
                }    

     }
  }
}
