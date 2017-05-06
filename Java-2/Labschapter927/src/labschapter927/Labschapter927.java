/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter927;
//Lab 9.27

import static java.nio.file.attribute.PosixFilePermissions.fromString;
import java.util.*;


public class Labschapter927 {
    public static void main(String[] args) {
     /*   Date [] dates = {
            fromString("01/01/2010"), // new year
            fromString("16/09/2010"), // 200 yrs Mex indepence 
            fromString("21/03/2010"), // uhhmm next spring?
            fromString("this/should/fail"), // invalid date.
        };
        */
        
    //  Date [] dates = {new Date(), new Date()};
        java.util.Date[] dates = new java.util.Date(10);
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());
    }
}

//the result will be null because the dates variable was not initialized