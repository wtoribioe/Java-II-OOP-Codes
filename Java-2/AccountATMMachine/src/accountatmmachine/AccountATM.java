package accountatmmachine;
/** Assignment #1 Task 10.2 */
/**author Wilfrido Toribio Espinosa */

import java.util.*;
public class AccountATM {
    /** The radius of the circle */
  private double balance = 100;
  private double deposit = 0;
  private double withDraw = 0;

  /** Construct all account with balance equal 100 */
  public AccountATM() {
      double balance = 100;
      double deposit = 0;
      double withDraw = 0;
  }
   
  /** Construct account with specific balance  */
  public AccountATM(double newBalance,double newDeposit,double newWithDra) {
    balance = newBalance;
    deposit = newBalance;
    withDraw = newBalance;
  }
/** Set a new balance */
  public void setBalance(double newBalance,double newDeposit,double newWithDraw) {
    balance = (newBalance >= 0) ? newBalance : 0;
    deposit = (newBalance >= 0) ? newBalance : 0;
    withDraw = (newBalance >= 0) ? newBalance : 0;
  }
  
  /** Return balance */
  public double getBalance() {
    return balance;
  }
  /** Return balance */
  public double getDeposit() {
    return deposit;
  }
  /** Return balance */
  public double getWithDraw() {
    return withDraw;
  }
  /** Return balance */
  public void setDeposit(double newDeposit) {
    deposit = newDeposit;
  }
  /** Return balance */
  public void setWithDraw(double newWithDraw) {
    withDraw = newWithDraw;
  }
  /** Return final balance */
  public double getFinalBalance() {
    return balance = balance + (deposit - withDraw);
  }
}
