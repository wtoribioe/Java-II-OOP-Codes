/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkingpractices1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestKingPractices1 {
        public static void doSum(Integer x, Integer y) {
               System.out.println("(Integer sum is " + (x + y));
        }
        public static void doSum(Double x, Double y) {
               System.out.println("(Double sum is " + (x + y));
        }
        public static void doSum(float x, float y) {
               System.out.println("(float sum is " + (x + y));
        }
        public static void doSum(int x, int y) {
               System.out.println("(Int sum is " + (x + y));
        }
        public static void main(String[] args) {
            LocalDate date1 = LocalDate.now();
//            LocalDate date2 = LocalDate.now(2014,6,20); no supported
            LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
            System.out.println("Date1 = " + date1);
     //       System.out.println("Date2 = " + date2);
            System.out.println("Date3 = " + date3);
            
            doSum(10,20);
            doSum(10.0,20.0);
        }
  } 

        
