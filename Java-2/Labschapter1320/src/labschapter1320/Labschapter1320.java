/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1320;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Labschapter1320 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2013, 2, 1);
        
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar)calendar.clone();
        
        System.out.println("calendar == calendar1 is " + (calendar == calendar1));
        System.out.println("calendar == calendar2 is " + (calendar == calendar2));
        System.out.println("calendar.equals(calendar1) is " + (calendar.equals(calendar1)));
        
        System.out.println("\n----------------------------------- ");
        
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);
        
        ArrayList<Double> list2 = (ArrayList<Double>)list1.clone();
        ArrayList<Double> list3 = list1;
       
        list2.add(4.5);
        list3.remove(1.5);
        
        System.out.println("list1 is  " + list1);
        System.out.println("list2 is  " + list2);
        System.out.println("list3 is  " + list3);
        
        System.out.println("\n----------------------------------- ");
        int[] list11 = {1,2,3};
        int[] list22 = list11.clone();
        
        list11[0] = 7;
        list22[1] = 8;
        System.out.println("list11 is " + list11[0] + ", " + list11[1] + ", " + list11[2]);
        System.out.println("list22 is " + list22[0] + ", " + list22[1] + ", " + list22[2]);
    }
}
