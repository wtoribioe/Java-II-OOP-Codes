/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1901generics;

import java.util.ArrayList;
import java.util.Date;

//Coding without Generic 
public class LabsChapter1901Generics {
    
    public static void main(String[] args) {
       // ArrayList<int> intList = new ArrayList<>(); Only reference type <E/T> object can be declared, primitive type are not allow  
       ArrayList<String> strings = new ArrayList<>();
       strings.add("Red");
       strings.add("5");
       strings.add("White");
       strings.add("Black");
       strings.add("Blue");
       strings.add("Yellow");
       strings.add("Yellow");
       strings.set(4,"Green");
       
       // string.add(new Integer(1)); Compile Error because Generic allow only <E/T> specific object type into the Array
       ArrayList<Date> dates = new ArrayList<>();
       dates.add(new Date());
       dates.add(new Date(02-03-2012));
       dates.add(new Date(02-04-2013));
       dates.add(new Date(02-05-2014));
       dates.add(new Date(02-06-2016));
       dates.add(new Date(02-06-2016));
       dates.set(4,new Date());
       
       // date.add(new String()); //Compile Error because String object is not a Date type object
       ArrayList<Integer> intList = new ArrayList<>();
       intList.add(5); //Primitive type will be outboxed. Wrap 5 into a new Integer(5) object type
       intList.add(15);
       intList.add(25);
       intList.add(35);
       intList.add(45);
       intList.add(45);
       intList.set(4,50);
       
       ArrayList mixedList = new ArrayList();
       mixedList.add(new Date());
       mixedList.add(new String("Black"));
       mixedList.add("Read");
       mixedList.add("Blue");
       mixedList.add(45);
       mixedList.add(45);
       mixedList.add(5.5);
       mixedList.set(4,50);
       mixedList.add(6.5);
       
    //--------------------------------------------------------------------------   
    //  ArrayList<String> strings  = new ArrayList<>(); Cncrete ArrayList <String>
    //-------------------------------------------------------------------------
       System.out.println(" ");
       System.out.println("----String ArrayList ---- ");
       System.out.println(" ");
       System.out.println("strings instanceof ArrayList " + (strings instanceof ArrayList));
       System.out.println(" ");
       System.out.println(strings);
       System.out.println(" ");
       
       for (int i = 0; i < strings.size(); i++)
           System.out.println("index: " + i + " " + strings.get(i));
       
    //-------------------------------------------------------------------------- 
    // ArrayList<Date> dates = new ArrayList<>(); Concrete ArrayList
    //--------------------------------------------------------------------------   
       System.out.println(" ");
       System.out.println("----Date ArrayList -----");
       System.out.println(" ");
       System.out.println("dates instanceof ArrayList " + (dates instanceof ArrayList));
       System.out.println(" ");
       System.out.println(dates);
       
       System.out.println(" ");
       
       for (int i = 0; i < dates.size(); i++)
           System.out.println("index: " + i + " " + dates.get(i));
       
    //-------------------------------------------------------------------------------
    //  ArrayList<Integer> intList = new ArrayList<>(); Concrete ArrayList <Integer>
    //-------------------------------------------------------------------------------
       System.out.println(" ");
       System.out.println("----Integer ArrayList -----");
       System.out.println(" ");
       System.out.println("intList instanceof ArrayList " + (intList instanceof ArrayList));
       System.out.println(" ");
       System.out.println(intList);
       
       System.out.println(" ");
       
       for (int i = 0; i < intList.size(); i++)
           System.out.println("index: " + i + " " + intList.get(i)); 
       
    //-------------------------------------------------------------------------- 
    // ArrayList mixedList = new ArrayList();  Gneric arrayList <>
    //--------------------------------------------------------------------------
       System.out.println(" ");
       System.out.println("----Mixed ArrayList ---- ");
       System.out.println(" ");
       System.out.println("mixedList instanceof ArrayList " + (mixedList instanceof ArrayList));
       System.out.println(" ");
       System.out.println(mixedList);
       
    // Date date1 = mixedList.get(0); Compile error they are different types so need to be casted
       Date date1 = (Date)mixedList.get(0); //Casting the element [0]
       System.out.println(" ");
       
       for (int i = 0; i < mixedList.size(); i++)
           System.out.println("index: " + i + " " + mixedList.get(i));
    
    // Restriction on Generic Class:
    // 1) Can not use new E()  to instanciate the generic class
    //   E object = new E();  //Wrong because generic is executed a runtime, but the generic type E is not available at runtime
       
    // 2) Can not use new E[]  Array can not be created using generic type parameter
    // E[] elements = new E[10]; //Wrong
    // The work around is to cast the array 
    // E[] elements = (E[])new Object[10];  //correct
    // ArrayList<String>[] list = new ArrayList<String>[10]; //wrong
    // ArrayList<String>[] list = (ArrayList<String>[])new ArrayList[10]; //Correct  
    }
}
