
package accountatmmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

/** This is an extract work from the Assignment #2 Task 10.2 Account class Design for ATM*/
/**Author Wilfrido Toribio Espinosa */

public class AccounATMMachine { 
  public static void main(String[] args) {
    double amount = 0; int option = 0; int account = 0;
    Scanner input = new Scanner(System.in);
    
    // Declare Account Array  from the AccountATM Class  */
    AccountATM[] accountArray;
    
    // Create Account Array calling the method createAccountArray()
    accountArray = createAccountArray();
    
    // Call the method printAccountArray to Print all the Account with their balance in the Array
    printAccountArray(accountArray);
  
     //Entering the account# then showing main menu and get actions
        try {
        System.out.println(" Scotiabank ");
        System.out.println(" ATM Machine ");
        System.out.println(" ");
        System.out.println("Enter the acount number: ");
        account = input.nextInt();
        if ((account < 0) || (account > accountArray.length - 1)) {
            System.out.println("Please Enter a valid account number");
            System.exit(0);
          }
        System.out.println("Main Menu");
        System.out.println("1: Check balance ");
        System.out.println("2: Withdraw ");
        System.out.println("3: Depsoti ");
        System.out.println("4: Exit ");
        System.out.println("Select an option: ");
        option = input.nextInt();
        if ((option <= 0) || (option >= 5) ||(option == 4)) {
            System.out.println("Please Enter a valid option from the MENU");
            System.exit(0);
          }
        } 
        catch (InputMismatchException e) {
            System.out.print("Please Enter a valid number " + e.getMessage()); 
        }
        // Print specific ATM Account balance from the Array 
        if (option == 1) {
            printATMAccount(accountArray,account);
            balanceCalculatorATM(accountArray,account);
        }
        if (option == 2){
            System.out.println("Enter the amount to be withdraw: ");
            amount = input.nextDouble();
            if ((amount < 0) || (amount > 4000)) {
            System.out.println("Please check the amount to be withdraw");
            System.exit(0);
        } 
            accountArray[account].setWithDraw(amount);
            printATMAccount(accountArray,account);
            balanceCalculatorATM(accountArray,account);
        }           
           if (option == 3){
            System.out.println("Enter the amount to be Deposit: ");
            amount = input.nextDouble();
            if ((amount < 0) || (amount > 10000)) {
            System.out.println("Please check the amount to be deposit");
            System.exit(0);
        } 
            accountArray[account].setDeposit(amount);
            printATMAccount(accountArray,account);
            balanceCalculatorATM(accountArray,account);
        } 
  }
  /** Create an array of 10 Account objects */
  public static AccountATM[] createAccountArray() {
    AccountATM[] accountArray = new AccountATM[10];

    for (int i = 0; i < accountArray.length; i++) {
      accountArray[i] = new AccountATM();
    }
    // Return the account array
    return accountArray;
  } 
  /** Print the array of account and their balance */
  public static void printAccountArray(
    AccountATM[] accountArray) {
    System.out.println(" ");
    System.out.println("Scotiabank");
    System.out.println("ATM Machine ");
    System.out.println("Account#" +  "  InitalBal." + "  Deposit  " +  "  WithDraw " + " FinalBal");
    System.out.println("\n--------------------------------------------------");
    for (int i = 0; i < accountArray.length; i++) {
      System.out.printf("\n   " + i + "       "  + accountArray[i].getBalance() + "       " +
              accountArray[i].getDeposit() + "       " + accountArray[i].getWithDraw()+ "       " 
              + accountArray[i].getFinalBalance() );
    }

    System.out.println("\n--------------------------------------------------");

    // Compute and display the result
    System.out.printf("%-30s%-15f\n", "The total of final balance colunm is  ",
      balanceCalculator(accountArray));
    System.out.println(" ");
  }
  // Print specific ATM account
    /** Print specific account their balance and the total */
  public static void printATMAccount(
    AccountATM[] accountArray,int account) {
    System.out.println("Scotiabank");
    System.out.println("ATM Machine ");
    System.out.println("Account#" +  "  InitalBal." + "  Deposit  " +  "  WithDraw " + " FinalBal");
    System.out.println("\n--------------------------------------------------");
      System.out.printf("\n   " + account + "       "  + accountArray[account].getBalance() + "       " +
              accountArray[account].getDeposit() + "      " + accountArray[account].getWithDraw()+ "     " 
              + accountArray[account].getFinalBalance() );

    System.out.println("\n--------------------------------------------------");

    // Compute and display the total balance of the account
    System.out.printf("%-30s%-15f\n", "The total of final balance ATM is --->> ",
      balanceCalculatorATM(accountArray,account));
    System.out.println(" ");
  }

  /** Add final balance to the balanceaCalculator */
  public static double balanceCalculator(
      AccountATM[] accountArray) {
    // Initialize balanceCalculator
    double balanceCalculator = 0;
    // Add final balance to balanceCalculator
    for (int i = 0; i < accountArray.length; i++)
      balanceCalculator += accountArray[i].getBalance();
    return balanceCalculator;
  }
  
  /** Add final balance to the balanceaCalculator ATM*/
  public static double balanceCalculatorATM(
      AccountATM[] accountArray, int account) {
    // Initialize balanceCalculator
    double balanceCalculatorATM = 0;

    // Add final balance to balanceCalculator
      balanceCalculatorATM += accountArray[account].getBalance();

    return balanceCalculatorATM;
  }
}
