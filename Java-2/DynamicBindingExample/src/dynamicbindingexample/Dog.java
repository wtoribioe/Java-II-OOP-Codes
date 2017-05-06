/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicbindingexample;

class DynamicBindingExample {  
 void eat(){System.out.println("animal is eating...");}  
}  
  
public class Dog extends DynamicBindingExample{  
 @Override
 void eat(){System.out.println("Dynamic: dog is eating...");}  
  
 public static void main(String args[]){  
  DynamicBindingExample a = new Dog();  
  a.eat();  
 }  
}  
