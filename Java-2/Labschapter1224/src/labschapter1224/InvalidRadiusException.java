/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1224;
public class InvalidRadiusException extends Exception {
    private double radius;
    
    //Construct an exception
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    //return the radius
    public double getRadius() {
        return radius;
    }
}
