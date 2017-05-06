/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter125a;

import static java.lang.Byte.MAX_VALUE;

public class LabsChapter125a {
    public static void main(String[] args) {
//        System.out.println( 1 / 0);   //Runtime error "Exception in thread "main" java.lang.ArithmeticException: / by zero"
    //    System.out.println( 1.0 / 0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
        
     //   long value = long.MAX_VALUE  + 1;
        long value = MAX_VALUE  + 1;
        System.out.println(value);
    }
}
