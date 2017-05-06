/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1222;
public class Labschapter1222 {
    public static void main(String[] args) {
        isNumber("2");
        System.out.println("Is good");
    }
    public static boolean isNumber(String token) {
        try {
            System.out.println("Before parse to a double");
            Double.parseDouble(token);
            return true;
        }
        catch (java.lang.NumberFormatException ex) {
             return false;
    }
 }
}