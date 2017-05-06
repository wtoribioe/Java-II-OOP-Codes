/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1905generics;

public class LabsChapter1905Generics {
    public static void main(String[] args) {
        //Return the maximum of two objects
        LabsChapter1905Generics.max("Welcome", 23);   
        }
    public  static Comparable max(Comparable obj1, Comparable obj2) {
        //No generic used
            if (obj1.compareTo(obj2) > 0)     //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
                return obj1;
            else
                return obj2;
    }
}