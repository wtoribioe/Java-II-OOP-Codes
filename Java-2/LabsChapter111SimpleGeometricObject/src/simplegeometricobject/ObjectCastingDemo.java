/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;
//Labs 11.7 Object Casting Demo
public class ObjectCastingDemo {
   public static void main(String[] args) {
        //Using Dynamic binding to downcasting object from supperclass to subclass
        //Creating two objects
        Object object1 = new CircleFromSimpleGeometricObject(10,"Wihte",true);  //Dynamic binding need to be casted the Actual type with the Declared Type. ((CircleFromSimpleGeometricObject)object).getArea())
        Object object2 = new RectangleFromSimpleGeometricObject(10,10);  //Dynamic binding need to be casted the Actual type with the Declared Type. ((CircleFromSimpleGeometricObject)object).getArea())
        
        //Display Circle and Rectangle objects
        displayObject(object1);  //Using dynamic binding
        displayObject(object2); //Using dynamic binding
    }
    //A methdo for diplaying an object
    public static void displayObject(Object object) {
        //Instance of Circle object
        if (object instanceof CircleFromSimpleGeometricObject) {
            System.out.println("The Circle Area is " + 
                ((CircleFromSimpleGeometricObject)object).getArea());   //Casting the object. Actual type with the Declared type 
            System.out.println("The Circle Diameter is " + 
                ((CircleFromSimpleGeometricObject)object).getDiameter());  //Casting the object. Actual type with the Declared type
            System.out.println("The Circle Perimeter is " + 
                ((CircleFromSimpleGeometricObject)object).getPerimeter());  //Casting the object. Actual type with the Declared type
                 
            System.out.println(" ");
                 
            //Instance of Rectangle object
        }else if (object instanceof RectangleFromSimpleGeometricObject) {
            System.out.println("The Rectangle Area is " + 
                ((RectangleFromSimpleGeometricObject)object).getArea()); //Casting the object
            System.out.println("The Rectangle Perimeter is " + 
                ((RectangleFromSimpleGeometricObject)object).getPerimeter()); //Casting the object
       }
   }
}