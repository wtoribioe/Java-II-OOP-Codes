/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2002collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LabsChapter2002Collections {
    public static void main(String[] args) {

        //------Collection<String>--Concrete collection object--------
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Boston");
        collection.add("Atlanta");
        collection.add("Madison");
        collection.add("Dallas");
        
        //---------ArrayList<String>----Concrete collection object--------
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Boston");
        collection1.add("Atlanta");
        collection1.add("Madison");
        collection1.add("Dallas");
        
        //------List<String>--Concrete collection2 object--------
        List<String> collection2 = new ArrayList<>();
        collection2.add("New York");
        collection2.add("Boston");
        collection2.add("Atlanta");
        collection2.add("Madison");
        collection2.add("Dallas");
        
        //------Collection<String>--Iterator--------
        System.out.println("\nCollection<String>--Concrete collection ");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println("\nCollection<String>--Concrete collection ");
        //Other way of looping the collection objects
        for (String element : collection)
            System.out.println(element.toUpperCase() + " ");
        //------ArrayList<String>--Iterator--------
        
        System.out.println("\nArrayList<String>--Concrete collection1");
        Iterator<String> iterator1 = collection1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().toUpperCase() + " ");
        }
        //------List<String>--Concrete collection2 object--------
        System.out.println("\nList<String>--Concrete collection2");
        for (String element : collection2)
            System.out.println(element + " ");
        System.out.println();
    }
}
