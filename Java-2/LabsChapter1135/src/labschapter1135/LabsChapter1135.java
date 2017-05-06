/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1135;

import java.util.ArrayList;
import java.util.Arrays;

public class LabsChapter1135 {

    public static void main(String[] args) {
        Integer[] array = {3,5,95,4,15,34,3,6,5};
        ArrayList<Integer> list1 =  new ArrayList<>(Arrays.asList(array));
        
        //Primitive array of integer cannot be use with ArrayList need an Object like String and Integer/Double type 
        int[] array0 = {3,5,95,4,15,34,3,6,5};
        ArrayList<Integer> list2 =  new ArrayList<>(Arrays.asList(array0));
        
        
        //Collection class only can not be used with primitive array  unmutable containers
        int[] array1 = {3,5,95,4,15,34,3,6,5};
        System.out.println(java.util.Collections.max(array1));
        //Collection class only can not be used with primitive array  unmutable containers
        Integer[] array11 = {3,5,95,4,15,34,3,6,5};
        System.out.println(java.util.Collections.max(array11));
        
        
        //Collection class only can be used with collection iterator like array list mutable containers
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(3);
        array2.add(5);
        array2.add(9);
        array2.add(5);
        array2.add(4);
        array2.add(15);
        array2.add(34);
        array2.add(3);
        array2.add(6);
        array2.add(5);
        System.out.println(java.util.Collections.max(array2));
        
    }
    
}
