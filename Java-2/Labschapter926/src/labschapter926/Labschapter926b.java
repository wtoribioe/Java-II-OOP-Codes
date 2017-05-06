
package labschapter926;

//9.26b 

import java.util.Date;

public class Labschapter926b {
    public static void main(String[] args) {
        Date date = new Date(1234567); 
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date){
        date = new Date(7654321);
    }  
}

//Result 1234567 because the object was instantiated with the value but not changed