/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter136a;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Labschapter136a {
    public static void main(String[] args) {
        //Construct a Gregorian calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("Year is " + calendar.get(Calendar.YEAR));
        System.out.println("Month is " + calendar.get(Calendar.MONTH));
        System.out.println("Date is " + calendar.get(Calendar.DATE));
        System.out.println("Hour is " + calendar.get(Calendar.HOUR));
        System.out.println("Hour of the Day is " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute is " + calendar.get(Calendar.MINUTE));
        System.out.println("Second is " + calendar.get(Calendar.SECOND));
        System.out.println("Day Of the Week is " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of the Month is " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the Year is " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week of the Month is " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week of the Year is " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM is " + calendar.get(Calendar.AM_PM));
        
        //Construct a calendar for September 11, 2001
        Calendar calendar1 = new GregorianCalendar(2001,8,11);
        String[] dayNamerOfWeek = {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
        System.out.println("September 11, 2001 is a " + dayNamerOfWeek[calendar1.get(calendar.DAY_OF_WEEK) - 1]);
        System.out.println("Total days of the Month " + calendar1.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
    
}
