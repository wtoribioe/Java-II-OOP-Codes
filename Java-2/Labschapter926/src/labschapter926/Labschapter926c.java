
package labschapter926;

//9.2c 

import java.util.Date;

public class Labschapter926c {
    public static void main(String[] args) {
        Date date = new Date(1234567); 
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date){
        date.setTime(7654321);
    }  
}

//Result 7654321 because it was the changed after the instantiation