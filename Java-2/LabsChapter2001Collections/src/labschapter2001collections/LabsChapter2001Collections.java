/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2001collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LabsChapter2001Collections {
    public static void main(String[] args) {
        //---------ArrayList<String>----Concrete collection object--------------
        //List<String> collection1 = new ArrayList<>(); //Correct statement List<> an interface and ArrayList<> is a concrete class 
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Boston");
        collection1.add("Atlanta");
        collection1.add("Madison");
        collection1.add("Dallas");
        
        System.out.println("A list of cities in collection-1: ");
        System.out.println(collection1);
        
        System.out.println("\nIs Dallas in collection-1? " + collection1.contains("Dallas"));
        
        collection1.remove("Dallas");
        System.out.println("Removing Dallas");
        System.out.println("\n " + collection1.size() + " cities are in collection-1 now");
        
        //-----Collection<String>---Interface that contain all methods sucha as contains,remove ..---------
        Collection<String> collection2 = new ArrayList<>();  //Collection<> is an interface and ArrayList<> is a concrete class
        collection2.add("Seatle");
        collection2.add("Portland");
        collection2.add("New York");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        collection2.add("California");
        
        System.out.println("\nA list of cities in collection-2: ");
        System.out.println(collection2);
        
       //----------------ArrayList<String>(collection1.clone())----------------- 
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone()); //Copy the collection1 to c1 so orginal one remain the same
        c1.addAll(collection2);   //SQL Union A+B = C
        System.out.println("\nAdded all Cities in collection 1 and collection 2 to [c1]: ");
        System.out.println(c1);
        System.out.println("\n " + c1.size() + " Cities in c1");
        System.out.println(collection1);
        System.out.println(collection2);
        
        c1 = (ArrayList<String>)(collection1.clone()); //Copy the collection1 to c1 so orginal one remain the same
        c1.retainAll(collection2); //SQL Intersection Commun records in A and B are passed to C.
        System.out.println("\nRetainedAll Cities in collecton 1 and collection 2 into [c1]: ");
        System.out.println(c1);
        System.out.println("\n " + c1.size() + " Cities in c1");
        System.out.println(collection1);
        System.out.println(collection2);
        
        c1 = (ArrayList<String>)(collection1.clone()); //Copy the collection1 to c1 so orginal one remain the same
        c1.removeAll(collection2); //SQL keep intersection between A and B and remove the rest
        System.out.println("\nRemovedAll Cities in collecton 2, but not n collection 1: ");
        System.out.println(c1);
        System.out.println("\n " + c1.size() + " Cities in c1");
        System.out.println(collection1);
        System.out.println(collection2);
    }
}
