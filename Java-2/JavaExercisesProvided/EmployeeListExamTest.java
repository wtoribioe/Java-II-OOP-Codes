/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeelistexamtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListExamTest {
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> employeeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        java.io.File file = new java.io.File("Salary.txt");
        
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            System.out.println("Enter the number of employee to be add to the file: ");
            int list = input.nextInt();
            
            for (int i = 0; i < list; i++) {
                System.out.println("Employee Frist Name: ");
                String firstName = input.next();
                System.out.println("Employee Last Name: ");
                String lastName = input.next();
                System.out.println("Employee Gender (M/F/O: ");
                String gender = input.next();
                System.out.println("Employee Salary: ");
                double salary = input.nextDouble();
                //Writting to the file
                String line = firstName + " " + lastName + " " + gender + " " + salary;
                employeeList.add(line);
                output.println(line);
            }
            //Close file
            System.out.println(employeeList);
            output.close();
            System.out.println("Is it absolute? " + file.getAbsolutePath());
            System.out.println("The file has " + file.length() + " bytes");
        }  
        catch (java.io.IOException ex) {
            System.out.println("I/O Eroros: not such file");
        }
    }
  }