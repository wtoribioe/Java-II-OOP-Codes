/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1905agenerics;

public class LabsChapter1905aGenerics {
    public static void main(String[] args) {
        //Return the maximum of two objects
       // max("Welcome", 23); //java.lang.RuntimeException: Uncompilable source objects String obj1 vs Integer obj2 must be the same objects Type
       System.out.println(max(40, 23));
    }
    // Using generic 
    public  static <E extends Comparable<E>> E  max(E obj1, E obj2) {
            if (obj1.compareTo(obj2) > 0)   //java.lang.RuntimeException: Uncompilable source objects String obj1 vs Integer obj2
                return obj1;
            else
                return obj2;
    }
}