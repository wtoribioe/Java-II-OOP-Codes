/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1329;

public class Labschapter1329 {

    public static void main(String[] args) {
        //Create na initializa two rational  numbers r1 and r2
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(4,2);
        
        //Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
        
        System.out.println(" ");
        Rational r11 = new Rational(-2,6);
        System.out.println(r11.getNumerator());
        System.out.println(r11.getDenominator());
        System.out.println(r11.intValue());
        System.out.println(r11.doubleValue());
        
        System.out.println(" ");
        Rational r22 = new Rational(-2,6);
        Object r23 = new Rational(1,45);
       // System.out.println(r23.compareTo(r22)); //Incomopatible Objects 
        
        System.out.println(" ");
        Object r44 = new Rational(1,45);
        Rational r45 = new Rational(-2,6);
       // System.out.println(r55.compareTo((Rational) r44));
      //  System.out.println(r45.compareTo(r44));  //Incomopatible Objects need to be cast
        
        System.out.println(" ");
        Rational r56 = new Rational(1,2);
        Rational r57 = new Rational(1,-2);
        System.out.println(r56.add(r57));
    }
    
}
