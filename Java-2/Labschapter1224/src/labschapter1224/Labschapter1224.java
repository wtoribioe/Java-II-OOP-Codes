/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1224;

public class Labschapter1224 {

    public static void main(String[] args) {
        try {
            new CircleWithCustomeException(5);
            new CircleWithCustomeException(-5);
            new CircleWithCustomeException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
    }
        System.out.println("Number of objects created: " + 
               CircleWithCustomeException.getNumberOfObjects());
  }
}
    
class CircleWithCustomeException {
    // The radius of the circle
    private double radius;
    
    //The number of objects created
    private int numberOfObjects = 0;
    
    //Construct a circle with radius 1
    public CircleWithCustomeException() throws InvalidRadiusException {
        this(1.0);
    }
   //Construct a circle with a specified radius
    public CircleWithCustomeException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }
    //Return radius
    public double getRadius() {
        return radius;
    }
    //Set a new radius
    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0)
                radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }
    //Return the area of the circle
    public double findArea() {
        return radius * radius * 3.14159;
    }
    public static int getNumberOfObjects() {
            return numberOfObjects++;
    }
}