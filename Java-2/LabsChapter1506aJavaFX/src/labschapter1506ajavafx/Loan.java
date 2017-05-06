/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1506ajavafx;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    
    //** Default constructor
    public Loan() {
        this(2.5,1,1000);
        
    }
    //*** Construct a loan with speficified annual interest rate, number of yeras ad and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate =  annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate =  new java.util.Date();
    }
        //**Returning annual interest rate
        public double getAnnualInterestRate(){
            return annualInterestRate;
        }
         //**set new annual interest rate
        public void setAnnualInterestRate(double annualInterestRate){
            this.annualInterestRate = annualInterestRate;
    }
        //**Returning number Of Years
        public int getNumberOfYears(){
            return numberOfYears;
        }
        //**Set new number of Years
        public void setNumberOfYears(){
            this.numberOfYears = numberOfYears;
        }
        //**Returning loan ammount
        public double getLoanAmount(){
            return loanAmount;
        }
        //**Set new loan amount
        public void setLoanAmount(double loanAmount){
            this.loanAmount = loanAmount;
        }
        //**Find monthly payment
        public double getMonthlyPayment(){
            double monthlyInterstRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterstRate / 
            (1 -( 1 / Math.pow(1 + monthlyInterstRate, numberOfYears * 12 )));
            return monthlyPayment;
        }
        //**Find total payment
        public double getTotalPayment(){
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }
        //**Return loan date
        public Date getloanDate(){
         return loanDate;   
            
        }

    }
