/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter128;

public class LabsChapter128 {

    public static void main(String[] args) {
    //Lab (a)
    System.out.println(1 / 0);  //Exception in thread "main" java.lang.ArithmeticException:
     
    //Lab (b)
    int[] list = new int[5]; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 
    System.out.println(list[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
     
    //Lab (c)
    String str = "abc"; //Exception in thread "main" java.lang.StringIndexOutOfBoundsException
    System.out.println(str.charAt(3)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException
      
    //Lab (d)
    Object obj1 = new Object(); //Exception in thread "main" java.lang.ClassCastException
    String d = (String)obj1; //Exception in thread "main" java.lang.ClassCastException
     
    //Lab (e)
    Object obj2 = null;  //Exception in thread "main" java.lang.NullPointerException
    System.out.println(obj2.toString()); //Exception in thread "main" java.lang.NullPointerException
        
    //Lab (f)
    System.out.println(1.0 / 0);  //Infinity  no exception error happen
        
    }
}
