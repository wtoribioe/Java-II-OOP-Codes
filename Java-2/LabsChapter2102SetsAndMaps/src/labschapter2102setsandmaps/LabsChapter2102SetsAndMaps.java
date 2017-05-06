/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2102setsandmaps;

import java.util.HashSet;
import java.util.Set;

public class LabsChapter2102SetsAndMaps {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();  //Set<> is an interface and HashSet<> is a concrete class
        //Add string to the set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        set1.add("Beijing");
        
        System.out.println("\nDuplicate element will be elminated");
        System.out.println("Set-1 is: " + set1);
        System.out.println(set1.size() + " element in set1");
        System.out.println();
        
        //Delete string from set1
        System.out.println("Delete London from set1");
        set1.remove("London");
        System.out.println("Set-1 is: " + set1);
        System.out.println(set1.size() + " element in set1");
        
        //Create set2
        Set<String> set2 = new HashSet<>();
        
        //Add string to the set2
        set2.add("London");
        set2.add("Shangai");
        set2.add("Paris");
        set2.add("Beijing");
        
        System.out.println("\nSet-2 is: " + set2);
        System.out.println(set2.size() + " element in set2");
        
        System.out.println("Searching in set2");
        System.out.println("Is Taipei in set2? " + set2.contains("Taipei"));
       
        //Adding
        System.out.println("\nAdding set2");
        System.out.println("Set-1 is: " + set1);
        System.out.println("Set-2 is: " + set2);
        set1.addAll(set2);
        System.out.println("After adding set2 to set1, set1 is " + set1);
        System.out.println(set1.size() + " element in set1");
        
        //Removing
        System.out.println("\nRemoving set2");
        System.out.println("Set-1 is: " + set1);
        System.out.println("Set-2 is: " + set2);
        set1.removeAll(set2);
        System.out.println("After removing set2 to set1, set1 is " + set1);
        System.out.println(set1.size() + " element in set1");
        
        //Retaining
        System.out.println("\nRetaining");
        System.out.println("Set-1 is: " + set1);
        System.out.println("Set-2 is: " + set2);
        System.out.println(set1.retainAll(set2));
        System.out.println("After removing commun elements in set2 " + "from set1, set1 is" + set1);
        System.out.println(set1.size() + " element in set1");
    }
}
