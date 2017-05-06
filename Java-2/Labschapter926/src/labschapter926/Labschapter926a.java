
package labschapter926;

//9.26a lab

import java.util.Date;

public class Labschapter926a {
    public static void main(String[] args) {
        Date date = null; 
        m1(date);
        System.out.println(date);
    }
    public static void m1(Date date){
        date = new Date();
    }
}

//Result 1234567 because it was the first call passing value