/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2105setsandmaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LabsChapter2105SetsAndMaps {

    public static void main(String[] args) {
        // Create a tree set for geometric objects using a comparator
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4,5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4,1));
        
        //Display geometric objects in the tree set
        System.out.println("A sorted set pf geometric objects");
        for (GeometricObject element : set)
            System.out.println("Area = " + element.getArea());
        //---------------------------------------------------------------------
        
        /*Explanation: Before the loop, the list is [A, B, C, D]. After invoking
        list.remove(0), the list becomes [B, C, D] and size becomes 3. Invoking
        remove(1) now deletes C from the list. The list becomes [B, D]. Now the list
        size is 2 and i is 2. So the loop ends.
        */
        System.out.println(" ");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println(" ");
        for (int i = 0; i < list.size(); i++)
            System.out.println("index " + i + " " + list.remove(i));
        
        //---------------------------------------------------------------------
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("red");
        list1.add("green");
        System.out.println("\n" + list1);
        // Remove the element red from the list 
        String element1 = "red";
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list1.get(i).equals(element1)) {
                list1.remove(element1);
               // System.out.println("index " + i + " " + list1);
            }
        }
        System.out.println(list1);
        
        //---------------------------------------------------------------------
        List<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("green");
        list2.add("red");
        list2.add("green");
        System.out.println(" ");
        System.out.println(list2);
        // Remove the element red from the list 
        String element2 = "red";
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).equals(element2)) {
                list2.remove(element2);
               // System.out.println("index " + i + " " + list1);
            }
        }
        System.out.println(list2);
        
        //---------------------------------------------------------------------
        System.out.println(" ");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.remove(2);
        System.out.println(list3);
        
        //---------------------------------------------------------------------
        List<String> list10 = new ArrayList<>();
        list10.add("Atlanta");
        list10.add("Macon");
        list10.add("Savanna");

        List<String> list12 = new ArrayList<>();
        list12.add("Atlanta");
        list12.add("Macon");
        list12.add("Savanna");

        List<String> list13 = new ArrayList<>();
        list13.add("Macon");
        list13.add("Savanna");
        list13.add("Atlanta");
        System.out.println(list10.equals(list12) + " " + list10.equals(list13));
    }
}
