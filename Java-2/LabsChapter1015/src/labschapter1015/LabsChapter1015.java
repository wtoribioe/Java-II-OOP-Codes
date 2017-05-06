/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1015;

public class LabsChapter1015 {

    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.replace("Java", "HTM"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.replaceAll("o", "T"));
        System.out.println(s1.replaceFirst("W", "T"));
        System.out.println(s1.toCharArray());
        
        System.out.println(" ");
        String s5 = s1.replace("o", "abc");
        System.out.println(s1);
        System.out.println(s5);
    }
}
