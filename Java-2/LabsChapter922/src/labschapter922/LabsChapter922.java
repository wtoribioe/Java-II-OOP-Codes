/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter922;

public class LabsChapter922 {
    private double radius = 1;
    
    public double getArea() {     //Accessor methor             
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
         LabsChapter922 myCricle = new LabsChapter922();
         
         System.out.println("Radius is " + myCricle.radius); //No problem the values of the instance variable is displayed
         System.out.println("Radius is " + myCricle.getArea()); //Accessor methor 
    }
    
}
