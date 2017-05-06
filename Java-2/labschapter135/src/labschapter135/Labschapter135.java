/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter135;

import java.util.ArrayList;
import java.Math.*;
import java.math.BigDecimal;

public class Labschapter135 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45); 
        //add an integer
        list.add(3445.53); 
        //add a BigInteger
        list.add(new BigInteger("34323232343443101"));
        //add a Bigdecimal
        list.add(new BigDecimal("2.090909090934334"));
        
        System.out.println("The largest number is " +
                getLargeNumber(list));
        System.out.println(list);
        
    }
    public static Number getLargeNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) 
            return null;
        
        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) 
            if (number.doubleValue() < list.get(i).doubleValue())
                    number = list.get(i);
        return number;
    }
    
}
