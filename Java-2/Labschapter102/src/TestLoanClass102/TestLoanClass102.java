/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLoanClass102;

import java.util.Scanner;

public class TestLoanClass102 {

    public static void main(String[] args) {
        //Create Scanner 
        Scanner input =  new Scanner(System.in);
        
        // Enter annual interest rate
        System.out.println("*****Loan Calculator****" );
        System.out.println(" " );
        System.out.print("Enter annual interes rate :" );
        double annualInterestRate = input.nextDouble();
        
        // Enter number of years
        System.out.print("Enter numer of years as integger :");
        int numberOfYears = input.nextInt();
        
        //Enter loan amount
        System.out.print("Enter loan Amount :");
        double loanAmount = input.nextDouble();
        
        //Create loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        
        //Dispplay loan date, monthly payment and total payment
        System.out.printf("The loan wsa created on %s\n" + "The montly payment is %.2f\nThe total payment is %.2f\n",
                loan.getloanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());  
    }
}
