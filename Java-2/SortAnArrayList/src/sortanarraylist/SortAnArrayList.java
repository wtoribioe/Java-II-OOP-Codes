/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortanarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArrayList {

    public static void main(String[] args) {
       List<String> fruits = new ArrayList<>();

       fruits.add("Pineapple");
       fruits.add("Apple");
       fruits.add("Orange");
       fruits.add("Banana");

       Collections.sort(fruits);

int i=0;
for(String temp: fruits){
	System.out.println("fruits " + ++i + " : " + temp);
    }
  }
}
