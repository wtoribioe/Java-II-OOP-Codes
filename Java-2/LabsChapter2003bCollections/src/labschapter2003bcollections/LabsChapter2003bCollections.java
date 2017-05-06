/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2003bcollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LabsChapter2003bCollections {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Blue", "Yellow", "Green", "Pink", "Gray");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Reversed List");
        System.out.println(list);
        
        System.out.println();
        List<String> list1 = Arrays.asList("Red", "Blue", "Yellow", "Green", "Pink", "Gray");
        List<String> list2 = Arrays.asList("White", "Black");
        System.out.println(list1);
        Collections.copy(list1, list2);
        System.out.println("Copied List1");
        System.out.println(list1);
        
        System.out.println();
        Collection<String> c1 = Arrays.asList("Red", "Cyan");
        Collection<String> c2 = Arrays.asList("Red", "Blue");
        Collection<String> c3 = Arrays.asList("Pink", "Tan");
        System.out.println(Collections.disjoint(c1, c2));
        System.out.println(Collections.disjoint(c1, c3));
        
        System.out.println();
        Collection<String> collection = Arrays.asList("Red", "Cyan", "Red");
        System.out.println(Collections.frequency(collection,"Red"));
        
    }
}
