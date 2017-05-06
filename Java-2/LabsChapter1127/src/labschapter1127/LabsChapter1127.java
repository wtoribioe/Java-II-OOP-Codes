/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1127;

public class LabsChapter1127 {
    public static void main(String[] args) {
       
        LabsChapter1127 fruits = new LabsChapter1127();
 
        Fruit fruit1 = new Fruit();
        Apple apple1 = new Apple(); 
        Apple fruit2 = new Fruit();  //java.lang.ClassCastException: error. Fruit cannot be cast to Apple
        Fruit apple2 = new Apple();
        Object fruit3 = new Fruit();
        Object apple3 = new Apple(); 
        
        if (apple1 instanceof Fruit) {
            System.out.println("apple is an instanceof Apple");
        }
            System.out.println("apple is an instanceof Fruit");
  }
}
class Apple extends Fruit {  //Apple cannot be instance of Fruit because Apple is the subclass and Fruit the supper class- a subtype
    
}
class Fruit {
    
}