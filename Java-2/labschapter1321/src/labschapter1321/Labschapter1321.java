/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1321;

public class Labschapter1321 {

    public static void main(String[] args) {
        Person[] persons = {new Person(3),new Person(4),new Person(1)};
        java.util.Arrays.sort(persons);  //ClassCastException: Person cannot be cast
    }
}
class Person {
    private int id;
    
    Person(int id) {
        this.id = id;
    }
}