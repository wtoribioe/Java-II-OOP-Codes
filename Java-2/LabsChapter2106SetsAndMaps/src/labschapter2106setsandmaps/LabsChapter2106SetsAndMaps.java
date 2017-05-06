/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2106setsandmaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class LabsChapter2106SetsAndMaps {
    static final int N = 50000;
    
    public static void main(String[] args) {
        //Add numbers 0, 1, 2 ...N -1 to the array list
        List<Integer> list = new ArrayList<>();  //List<> is an interface and ArrayList<> is a concrete c;ass
        for (int i = 0; i < N; i++) 
            list.add(i);
        Collections.shuffle(list);
        
        //Create a hash set, and test its performance
        Collection<Integer> set1 = new HashSet<>(list);  //Collection<> is an Interface and HashSet<> is a concrete class
        System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove elements for hash set is " + getRemoveTime(set1) + " milliseconds");
        
        //Create a linkedhash set, and test its performance
        Collection<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("Member test time for linked hash set is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove elements for linked hash set is " + getRemoveTime(set2) + " milliseconds");
        
        //Create a treehash set, and test its performance
        Collection<Integer> set3 = new TreeSet<>(list);
        System.out.println("Member test time for tree hash set is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove elements for tree hash set is " + getRemoveTime(set3) + " milliseconds");
        
        //Create a array list, and test its performance
        Collection<Integer> list1 = new ArrayList<>(list);
        System.out.println("Member test time for array list is " + getTestTime(list1) + " milliseconds");
        System.out.println("Remove elements for array list is " + getRemoveTime(list1) + " milliseconds");
        
        //Create a linked list, and test its performance
        Collection<Integer> list2 = new LinkedList<>(list);
        System.out.println("Member test time for linked list is " + getTestTime(list2) + " milliseconds");
        System.out.println("Remove elements for linked list is " + getRemoveTime(list2) + " milliseconds");
        
    }
    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        
        //Test if a number is in the collection
        for (int i = 0; i < N; i++)
            c.contains((int)(Math.random() * 2 * N));
            
        return System.currentTimeMillis() - startTime;
    }
     public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        
        //Test if a number is in the collection
        for (int i = 0; i < N; i++)
            c.remove(i);
            
        return System.currentTimeMillis() - startTime;
    }
}