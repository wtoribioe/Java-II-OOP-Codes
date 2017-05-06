/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter461;

public class Labschapter461 {

    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.println("Interest is $" + interest);
        
        double amount1 = 12618.98;
        double interestRate1 = 0.0013;
        double interest1 = amount * interestRate1;
        System.out.println("Interest is $" + (int)interest1 * 100 / 100.0);
        
        double amount11 = 12618.98;
        double interestRate11 = 0.0013;
        double interest11 = amount * interestRate11;
        System.out.printf("Interest is  $%4.2f\n", interest);
    }
}
