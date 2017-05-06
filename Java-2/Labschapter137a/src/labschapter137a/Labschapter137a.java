/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter137a;

public class Labschapter137a  {
    public static void main(String[] args) {
        //Array if objects
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        
        for (int i = 0; i <objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible)objects[i]).howToEat());
            }
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal)objects[i]).howToSound());
            }
        }
    } 
}
