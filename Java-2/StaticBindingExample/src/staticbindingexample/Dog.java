/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticbindingexample;

class StaticBindingExample {
}

public class Dog{  
 private void eat(){
     System.out.println("Srtatic: dog is eating...");
 }  
  
 public static void main(String args[]){  
  Dog d1 = new Dog();  
  d1.eat();  
 }  
}  