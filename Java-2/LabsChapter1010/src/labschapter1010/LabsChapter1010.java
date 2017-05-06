/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1010;

public class LabsChapter1010 {
    

    public static void main(String[] args) {
        /** 10.8 Automatically converted to an Integer Object (Autoboxing) */
        Integer x1 = new Integer(3);
        System.out.println(x1.intValue());
        System.out.println(x1.compareTo(new Integer(4)));
        
        /** 10.12 Automatically converted to an Integer Object (Autoboxing) */
        Integer[] intArray = {1,2,3};
        System.out.println(intArray[0] + intArray[1] + intArray[2]);
        
    //   Integer = 3 + new Integer(5);
       
       Integer x2 = 3;
    //   Double x3 = 3; //incompatible
       Double x4 = 3.0;
       int x5 = new Integer(3);
       int x6 = new Integer(3) + new Integer(4);
       
       System.out.println(x2);
       System.out.println(x4);
       System.out.println(x5);
       System.out.println(x6);
       
       
       
       
    }
    
}
