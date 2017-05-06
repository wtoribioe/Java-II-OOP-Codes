/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter462;

public class Labschapter462 {

    public static void main(String[] args) {
        //Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        
        //Display vlues for 30 degrees
        int degrees3 = 30;
        double radians3 = Math.toRadians(degrees3);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees3,radians3,Math.sin(radians3),Math.cos(radians3), Math.tan(radians3));
        
        //Display vlues for 60 degrees
        int degrees6 = 60;
        double radians6 = Math.toRadians(degrees6);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees6,radians6,Math.sin(radians6),Math.cos(radians6), Math.tan(radians6));
    }
}
