/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter448b;

import java.lang.*;

public class StringDemo {

   public static void main(String[] args) {
  
   String str1 = "tutorials point", str2 = "http://";

   CharSequence cs1 = "int";
    
   // string contains the specified sequence of char values
   boolean retval = str1.contains(cs1);
   System.out.println("Method returns : " + retval);
    
   // string does not contain the specified sequence of char value
   retval = str2.contains("_");   
   System.out.println("Methods returns: " + retval);
   }
}
