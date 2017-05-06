/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter131;

public class LabsChapter131AbstractClassGeometricObject {
    public static void main(String[] args) {
       
        //Create two gemetric objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5,3);
        
        //Calling methods
        System.out.println("The two objects have the same area? " +
        equalArea(geoObject1,geoObject2));
        System.out.println("");
        
        //Display circle
        System.out.println("The area and perimeter for Circle Object is ");
        displayGeometricObject(geoObject1);
        System.out.println("");
        
        //Display rectangle
        System.out.println("The area and perimeter for Rectangle Object is ");
        displayGeometricObject(geoObject2);
    }
    //Method for comparing the areas of the two geometricObjects
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    //A method for displaying a geometricObject 
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is  " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
