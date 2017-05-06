 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter127;

public class CircleWithException {
   // The radius of the circle
    private double radius;
    
    // The number of the objects created
    private static int numberOfObjects = 0;
    
    // Construct a circle with radius 1
    public CircleWithException() {
        this(1.0);
    }
    //Construct a circle with specified radius
    public CircleWithException(double newRadius) {
        setRadius(newRadius);   //Methdo setRadius is called from here so exception error is checked then catched
        numberOfObjects++;
    }
    //Return radius
    public double getRadius() {
        return radius;
    }
    //Set a new radius
    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }
    //Return number of Objects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    //Return the area of this circle
    public double finalArea() {
        return radius * radius * 3.14159;
        }
    }
