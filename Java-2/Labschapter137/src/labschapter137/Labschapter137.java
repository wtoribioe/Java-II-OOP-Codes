/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter137;

public class Labschapter137 {

    public static void main(String[] args) {
       
      Number x = new Integer(3);
      System.out.println(x.intValue());
      System.out.println(x.compareTo(new Integer(4))); // RuntimeException: Uncompilable
        
      Integer xx = 5;
      System.out.println(xx.compareTo(3)); //Return 1 if the xx value is greater than the compareTo
      System.out.println(xx.compareTo(5)); //Return 0 if the xx value is thesame to the compareTo
      System.out.println(xx.compareTo(8)); //Return -1 if the xx value is less than the compareTo
        
    }
    
}
