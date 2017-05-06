/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

public class LabsChapter111SimpleGeometricObject {
    public static void main(String[] args) {
       
        //**Creating a Circle oobject and then printing it
        CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject(5);
        System.out.println("A circle " + circle1.toString());  //Using static binding
        System.out.println("Is filled " + circle1.isFilled());  //Using static binding
        System.out.println("The color is " + circle1.getColor());  //Using static binding
        System.out.println("The radius is " + circle1.getRadius()); //Using static binding
        System.out.println("The area is " + circle1.getArea());  //Using static binding
        System.out.println("The diameter is " + circle1.getDiameter());  //Using static binding
        System.out.println("------------------------------------------" );
        
        //**Creating a Circle oobject and then printing it
        CircleFromSimpleGeometricObject circle2 = new CircleFromSimpleGeometricObject(23.0,"Black", true);
        System.out.println("A circle " + circle2.toString());
        System.out.println("Is filled " + circle2.isFilled());
        System.out.println("The color is " + circle2.getColor());
        System.out.println("The radius is " + circle2.getRadius());
        System.out.println("The area is " + circle2.getArea());
        System.out.println("The diameter is " + circle2.getDiameter());
        System.out.println("The perimeter is " + circle2.getPerimeter());
        System.out.println("------------------------------------------" );
       
        //**Creating a Rectangle oobject and then printing it
        RectangleFromSimpleGeometricObject rectangle1 = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nA rectangle " + rectangle1.toString());
        System.out.println("Is filled " + rectangle1.isFilled());
        System.out.println("The color is " + rectangle1.getColor());
        System.out.println("The area is " + rectangle1.getArea());
        System.out.println("The perimeter is " + rectangle1.getPerimeter());
        System.out.println("------------------------------------------" );
         
        //**Creating a Rectangle oobject and then printing it
        RectangleFromSimpleGeometricObject rectangle2 = new RectangleFromSimpleGeometricObject(20,49,"Yellow", true);
        System.out.println("\nA rectangle " + rectangle2.toString());
        System.out.println("Is filled " + rectangle2.isFilled());
        System.out.println("The color is " + rectangle2.getColor());
        System.out.println("The area is " + rectangle2.getArea());
        System.out.println("The perimeter is " + rectangle2.getPerimeter());
    }
}
