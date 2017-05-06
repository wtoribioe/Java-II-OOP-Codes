/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter127;

public class LabsChapter127 {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(3);
            CircleWithException c2 = new CircleWithException(2);
            CircleWithException c3 = new CircleWithException(-5);
            
            System.out.println("c1 radius " + c1.finalArea());
            System.out.println("c2 radius " + c2.finalArea());
            System.out.println("c3 radius " + c3.finalArea());
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " +
           CircleWithException.getNumberOfObjects());
    }
}
