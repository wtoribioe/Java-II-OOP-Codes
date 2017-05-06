/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1329;

import static java.lang.Math.abs;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denomitator
    private long numerator = 0;
    private long denominator = 1;
    
    //Construct a rational with default properties
    public Rational(){
        this(0, 1);
    }
    //Construct a rational with specified numerator and denominator
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0) ? 1: -1 * numerator / gcd;
        this.denominator = Math.abs(abs(denominator)) /gcd;
    }
    //Find GCD of two numbers
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k ==0)
                gcd = k;
        }
        return gcd;  
    }
    //Return numerator
    public long getNumerator() {
        return numerator ;
    }
    //Return Denominator
    public long getDenominator() {
        return denominator;
    }
    //Add a rational number to this rationall
    public Rational add(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);     
    }
     //Subtract a rational number to this rationall
    public Rational subtract(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() -
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);    
    }
    //Multiply a rational number to this rationall
    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() *
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);    
    }
    //Divide a rational number to this rationall
     public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator() /
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n,d);    
   }
     @Override //Override the toString methdo in the Object class
     public String toString() {
         if (denominator == 1) 
             return numerator + "";
         else
             return numerator + "/" + denominator;
     }
     @Override //Override the equals methdo in the Object class
     public boolean equals(Object other) {
         if ((this.subtract((Rational)(other))).getNumerator() == 0 )
             return true;
         else
             return false;
     }
    @Override //Implement the abstract intValue methdo in the Number class
    public int intValue() {
        return (int)doubleValue();
    }
    @Override //Implement the abstract floatValue metdo in Number class
    public float floatValue() {
        return (float)doubleValue();
    }
    @Override  //Implement the abstract doubleValue metdo in Number class
    public double doubleValue() {
         return numerator * 1.0 / denominator;
    }
    @Override //Implement the abstract longValue metdo in Number class
    public long longValue() {
        return (long)doubleValue();
    }
    @Override //Implement the compareTo metdo in Number class
    public int compareTo(Rational obj) {
        if (this.subtract(obj).getNumerator() > 0)
            return 1;
        else
            return 0;
    }
}