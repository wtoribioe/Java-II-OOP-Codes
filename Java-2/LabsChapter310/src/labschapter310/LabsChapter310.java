/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter310;

public class LabsChapter310 {

    public static void main(String[] args) {
        int x = 1, a = 3, z = 0;
        
        //Conditional expression --> if x greater than 3 then x = 2 otherwise x = -2
        z = (x > 3) ? 2 : -2;
        System.out.println(z);
        System.out.println((x > 3) ? 2 : -2);
        
        System.out.println((x % 2 == 0) ? " x is even" : "x is odd");
        
        if (a == 1){
            x += 5;
            System.out.println(x);
        }else if (a == 2) {
            x += 10;
            System.out.println(x);
        }else if ( a == 3) {
            x += 16;
            System.out.println(x);
        }else if (a == 4) {
            x += 34;
            System.out.println(x);
        }
        
        for (int day = 0; day <= 6; day++) {
        switch (day) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thrusday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;   
            }
        }
      }
    }
    
