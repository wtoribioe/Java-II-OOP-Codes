/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package labschapter2003collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LabsChapter2003Collections {
    public static void main(String[] args) {

        //List<> collection object
        System.out.println("\nList<Integer> arrayList = new ArrayList<>():");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(0,10);
        arrayList.add(3,30);
        
        //Collection.sort(arrayList);
        System.out.println("Display List of integers in the array list:");
        System.out.println(arrayList);
        
        //LinkedList merches mutiple object types in one array list
        System.out.println();
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1,"Red");   //Strings objects
        linkedList.add(1,"White");
        linkedList.add(1,"Green");
        linkedList.add(1,"Black");
        linkedList.removeLast();
        linkedList.addFirst("Yellow");
        linkedList.add(10.5);    //Doubles Objects
        linkedList.add(40.80);
        linkedList.add(30);     //Integers objects autoboxed 
        linkedList.add(80);
        linkedList.add(new Date()); //Date objects
        
        System.out.println();  //While loop need an Isterator Object List to access the method hasNext
        System.out.println("\nDisplay the Linked list forward: ListIterator<Object>");
        //Collection.sort(linkedList);
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }
        
        System.out.println(); // While loop need an Isterator Object List to access the method hasPrevious
        System.out.println("\nDisplay the Linked list backward: ListIterator<Object>");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
           }
        
        System.out.println(); // For each loop does not need Iterator object
        System.out.println("\nFor each Loop likedList");
        for (Object element : linkedList) {
            System.out.println(element + " ");
        }
        
        System.out.println(); // For loop does not need Iterator object
        System.out.println("\nFor Loop likedList");
        for (int i = 0; i < linkedList.size(); i++) {
           System.out.println(linkedList.get(i) + " ");
        }   
    }
}
