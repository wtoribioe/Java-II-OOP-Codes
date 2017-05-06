/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter46;
public class LabsChapter46 {

    public static void main(String[] args) {
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
        System.out.println("toupperCase('q') is " + Character.toUpperCase('q'));
        
        char c1 = 'A';
        int i1 = (int)c1;;System.out.println(i1);
        float f = 1000.34f;
        int i2 = (int)f;;System.out.println(i2);
        double d = 1000.34;
        int i3 = (int)d;;System.out.println(i3);
        int i4 = 97;
        char c2 = (char)i4;;System.out.println(c2);
    }
    
}
