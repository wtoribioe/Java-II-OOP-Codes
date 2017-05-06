
package labschapter926;

//9.2d 

import java.util.Date;

public class Labschapter926d {
    public static void main(String[] args) {
        Date date = new Date(1234567); 
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date){
        date = null;
    }  
}

//Result 1234567 because it was the first call passing value