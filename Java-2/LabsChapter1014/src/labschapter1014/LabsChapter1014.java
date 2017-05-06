/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1014;
import java.math.BigInteger;
public class LabsChapter1014 {

    public static void main(String[] args) {
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");;
        
    //    java.math.BigInteger z = new x.add(y);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    //    System.out.println("z is " + z);
        System.out.println("FIN ");
        
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));
        System.out.println("FIN ");
        
        String[] tokens = "Java#HTM#Perl".split("#");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
        System.out.println("FIN ");

        String option1 = new String("R");
        String option2 = new String("A");
        String option3 = new String("R");
        String option4 = new String("M");
        String option5 = new String("E");
        
        System.out.println(option1.matches(option3));
        System.out.println(option1.equals(option3));
        System.out.println("FIN ");
    }
}
