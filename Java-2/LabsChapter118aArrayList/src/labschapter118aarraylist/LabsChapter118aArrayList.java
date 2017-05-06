/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter118aarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LabsChapter118aArrayList {

    public static void main(String[] args) {
       //int[] array = {10,2,3,4,5,65,6,7,80}; //incompatible type with the arrayList need to be Integer as object instead of priimitive type
       Integer[] array = {10,2,3,4,5,65,6,7,80};
       ArrayList<Integer> listArray = new ArrayList<>(Arrays.asList(array));
       System.out.println("Unsorted: " + listArray);
       java.util.Collections.sort(listArray);
       System.out.println("Sorted: " + listArray);
       
       System.out.println(" ");
       System.out.println("Max: " + java.util.Collections.max(listArray));
       System.out.println("Min: " + java.util.Collections.min(listArray));
       
       System.out.println(" ");       
       java.util.Collections.shuffle(listArray);
       System.out.println("Shuffle: " + listArray);
       
    }
    
}
