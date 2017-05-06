/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschaper1129;

public class LabsChaper1129 {

    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 =  new Circle();
        System.out.println(circle1.equals(circle2) + " Is and instance of Object");   
          
     //   Circle circle11 = new Circle();
     //    Circle circle22 =  new Circle();
     //      System.out.println(circle11.equals(circle22)+ " Is NO and instance of Circle");
    }
}
class Circle {
    double radius;
    
    public boolean equals(Circle circle) {
      
       return this.radius == circle.radius; //--> Results is FALSE when  instantiated using Object in both RETURN
       //return this.radius == ((Circle)circle).radius;  //--> Results is TRUE when instantiated using Circle ONLY
    }
}
