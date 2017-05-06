/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2003acollections;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LabsChapter2003aCollections {

    public static void main(String[] args) {
        //List<> collection object for sort
        System.out.println("Collections.sort()");
        System.out.println("List<String> list = arrays.asList():");
        List<String> list = Arrays.asList("Red", "Blue", "Yellow", "White", "Green", "Pink", "Gray");
        Collections.sort(list);
        System.out.println(list);
        
        //Reverse Order Sort
        System.out.println("\nReverse order sort list");
        System.out.println("Collections.sort(list,Collections.reverseOrder())");
        //Collections.reverse(list);  //The same as below statements
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println();
       
        //Binary Search Integers --Doesnt need to be Sorted--
        System.out.println("\nBinary Seach");
        List<Integer> list1 = Arrays.asList(2,4,7,10,45,50,59,60,66,80,96,100,4,4);
        System.out.println(list1);
        System.out.println("(1) Index: " + Collections.binarySearch(list1,7));
        System.out.println("(2) Index: " + Collections.binarySearch(list1,96));
        System.out.println("(3) Index: " + Collections.binarySearch(list1,9));
        
        //Binary Search Strings --Need to be Sorted first---
        System.out.println("\nUnordered list --inaccurate results--");
        List<String> list2 = Arrays.asList("Red", "Blue", "Yellow", "White", "Green", "Pink", "Gray");
        System.out.println(list2);
        System.out.println("(4) Index: " + Collections.binarySearch(list2, "White"));
        System.out.println("(5) Index: " + Collections.binarySearch(list2, "Cyan"));
        System.out.println("(5) Index: " + Collections.binarySearch(list2, "Yellow"));
        
        System.out.println("\nOrdered list --accurate results---");
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println("(4) Index: " + Collections.binarySearch(list2, "White"));
        System.out.println("(5) Index: " + Collections.binarySearch(list2, "Cyan"));
        System.out.println("(5) Index: " + Collections.binarySearch(list2, "Yellow"));
        
        //Reverse Order List
        System.out.println("\nReverse Ordered list elements--");
        //Collections.sort(list2,Collections.reverseOrder()); //The same as above 
        Collections.reverse(list2);
        System.out.println(list2);
        
        //Shuffle List order
        System.out.println("\nShuffle list Order elements--");
        Collections.shuffle(list2);
        System.out.println(list2);
        
        //Shuffle List order in random
        System.out.println("\nShuffle list elements Random order--");
        List<String> list3 = Arrays.asList("Red", "Blue", "Yellow", "White", "Green", "Pink", "Gray");
        List<String> list4 = Arrays.asList("Red", "Blue", "Yellow", "White", "Green", "Pink", "Gray");
        Collections.shuffle(list3, new Random(20));
        Collections.shuffle(list4, new Random(20));
        System.out.println(list3);
        System.out.println();
        System.out.println(list3);
        
        //Copying List dest to src -- Shadow copy list doesnt change at all--
        System.out.println("\nCopying Dest to Src lists--");
        List<String> list5 = Arrays.asList("Red", "Blue", "Yellow");
        List<String> list6 = Arrays.asList("White", "Green", "Pink", "Gray");
        
        //Before copying dest to src
        System.out.println("Dest: " + list5);
        System.out.println("Sorce: " + list6);
        Collections.copy(list6, list5);
        
        //After copying dest to src
        System.out.println();
        System.out.println("Dest: " + list5);
        System.out.println("Sorce: " + list6);
        
        //Max and min in the list--
        System.out.println("\nMax and min in the list--");
        System.out.println("Max: " + Collections.max(list2));
        System.out.println("Min: " + Collections.min(list2));
        
        //Disjoint element in the list-- there is not communt elements 
        System.out.println("\ndisjoint in the list--");
        System.out.println("Max: " + Collections.disjoint(list5,list6));
        System.out.println("Min: " + Collections.disjoint(list1,list2));
        
        //Frequency element in the list-- there is not communt elements 
        System.out.println("\nFrequency in the list--");
        System.out.println("Frequency: " + Collections.frequency(list1,4));
        
        //Filling the list-
        System.out.println("\nFilling the list--");
        List<String> list7 = Arrays.asList("White", "Green", "Pink", "Gray");
        System.out.println(list7);
        Collections.fill(list7,"Black");
        System.out.println(list7);
    }
  }
