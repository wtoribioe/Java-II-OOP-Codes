/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter107a;

public class LabsChapter107a {

    public static void main(String[] args) {
        
        //Wrapping objects
        System.out.println(Integer.parseInt("11" , 2));
        System.out.println(Integer.parseInt("12" , 8));
        System.out.println(Integer.parseInt("13" , 10));
        System.out.println(Integer.parseInt("1A" , 16));
//        System.out.println(Integer.parseInt("12" , 2)); //runtime error
        System.out.println(" ");
        Integer i1 = new Integer("23");System.out.println(i1);
        Integer i2 = new Integer(23);System.out.println(i2);
     // Integer i3 = new Integer.valueOf("23");
        Integer i3 = Integer.valueOf("23");System.out.println(i3);
     // Integer i4 = new Integer.parseInt("23",8);
        Integer i4 = Integer.parseInt("23",8);System.out.println(i4);
    //  Integer i5 = new Integer("23");
        Integer i5 = new Integer("23");System.out.println(i5);
     //   Double d = new Double();
        Double d1 = Double.valueOf("23.45");System.out.println(d1);
        int i = (Integer.valueOf("23")).intValue();System.out.println(i);
        double d2 = (Double.valueOf("23.4")).doubleValue();System.out.println(d2);
        int i7 = (Double.valueOf(23.4)).intValue();System.out.println(i7);
        String str = (Double.valueOf("23.4")).toString();System.out.println(str);
        
        String str1 = "Welcome to Java";
        String str2 = new String("Welcome to Java");
        String str3 =  ("Welcome to Java");
        System.out.println("str1 == str2 is " + (str1 == str2));
        System.out.println("str1 == str3 is " + (str1 == str3));
        System.out.println("str1.equals(str2) is " + (str1.equals(str2)));
        
        int[][] x = new int[][]; // Get an error because the first bracket need to be >=0
        int[] x1 = new int[]; // Get an error because the first bracket need to be >=0
        int[][] xx = new int[0][]; //Correct
        int[][] xx1 = new int[0][]; //Correct
        
    }
    
}
