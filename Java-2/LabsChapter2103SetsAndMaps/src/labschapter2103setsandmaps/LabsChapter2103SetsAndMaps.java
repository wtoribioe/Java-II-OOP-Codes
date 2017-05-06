/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2103setsandmaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LabsChapter2103SetsAndMaps {
    public static void main(String[] args) {
        //LinkedHashSet store nonduplicate and process elements in order they were entered.
        Set<String> set = new LinkedHashSet<>();  //Set<> is an interface and LinkedHashSet<> is a concrete class
        //Add string to the set1
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        set.add("Beijing");
        
        System.out.println("\nDuplicate element will be elminated");
        System.out.println("Set-1 is: " + set);
        System.out.println(set.size() + " element in set1");
        System.out.println();
        
        // System.out.println(element.toUpperCase() + " ");
        set.stream().forEach((element) -> {
            System.out.println(element + " ");
        });
        // System.out.println(element.toUpperCase() + " ");
        System.out.println();
        for (Object element : set)
           // System.out.println(element.toUpperCase() + " ");
            System.out.println(element + " ");
     
    }
}
