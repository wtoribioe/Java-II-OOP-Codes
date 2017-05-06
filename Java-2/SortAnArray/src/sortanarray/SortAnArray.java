/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortanarray;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};

Arrays.sort(fruits);

int i=0;
for(String temp: fruits){
	System.out.println("fruits " + ++i + " : " + temp);
    }
  }
}
