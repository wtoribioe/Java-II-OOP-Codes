/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1903genericboundedtype;

public class Circle extends GeometricObject {
    private double radius;
     
     //**Default constuctor that is always placed into the datafile declaration level to inicialize default vaulues
     public Circle() {
     }
    //**Constuctor for specified radius only so it will inherited the default values from the supperclass for color and filled
     public Circle(double radius) {
         this.radius = radius;
     }    
     //**Constuctor for specified radius allowing to change the values from both subclass and superclass datafields 
     public Circle(double radios, String color, boolean filled) {
        this.radius =  radius;
        super.setColor(color);     // Connstructor chaning from parent class
        super.setFilled(filled);  // Constructor chaning from parent class
     }
     //** Return radius */
     public double getRadius() {
         return radius;
     } 
     //** Set a new radius */
     public void seRadius(double radius) {
         this.radius = radius;
     }
     //** Return area */
    @Override
     public double getArea() {
         return   radius * radius * Math.PI;
     }
     //** Return diameter */
     public double getDiameter() {
         return 2 * radius; 
     }
     //** Return Perimeter */
    @Override
     public double getPerimeter() {
         return 2 * radius * Math.PI;
     }
    //** Return color */
    @Override
    public String getColor(){
        return color;
    }
    //** Set a new color */
    @Override
    public void setColor(String color){
        this.color = color;
    }
     //** Print the Circle info */
     public void printCircle() {
     System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}