/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2104setsandmaps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LabsChapter2104SetsAndMaps {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //Add string to the set1
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        set.add("Beijing");
        
        System.out.println("\nDuplicate element will be elminated");
        System.out.println("Undered Set-1 is: " + set);
        System.out.println(set.size() + " element in set1");
        System.out.println();
        
        //Add set intto the treeSet which keep elements ordered 
        //Set<String> treeSet = new TreeSet<>(set);
        TreeSet<String> treeSet = new TreeSet<>(set); 
        System.out.println("Ordered Sorted treeset: " + treeSet);
        System.out.println();
        
        //Use the methods in SortedSet interface
        System.out.println("Using the methods in SortedSet interface");
        System.out.println("First(): " + treeSet.first());
        System.out.println("Last(): " + treeSet.last());
        System.out.println("HeadSet(\"New Your\"): " + treeSet.headSet("New Your"));
        System.out.println("TailSet(\"New Your\"): " + treeSet.tailSet("New Your"));
    }
}
