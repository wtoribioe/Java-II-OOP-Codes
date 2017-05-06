/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter136b;

public class LabsChapter136b {
    public static void main(String[] args) {
        System.out.println(new Integer(7).compareTo(new Integer(5)));
        System.out.println(new Integer(3).compareTo(new Integer(5)));
        System.out.println(new Integer(5).compareTo(new Integer(5)));
        
        System.out.println("ABC".compareTo("ABE"));
        
        java.util.Date date1 = new java.util.Date(2013, 1 , 1);
        java.util.Date date2 = new java.util.Date(2012, 1 , 1);
        System.out.println(date1.compareTo(date2));  
        java.util.Date date11 = new java.util.Date(2010, 1 , 1);
        java.util.Date date22 = new java.util.Date(2012, 1 , 1);
        System.out.println(date11.compareTo(date22));  
        java.util.Date date10 = new java.util.Date(2012, 1 , 1);
        java.util.Date date20 = new java.util.Date(2012, 1 , 1);
        System.out.println(date10.compareTo(date20));  
    }
}
