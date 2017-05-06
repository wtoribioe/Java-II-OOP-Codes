/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1121b;

public class LabsChapter1121b {
    
public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}
class Student extends Person {
    private String getInfo() {
        return "Student-Without Override";
    }
}
class Person {
    private String getInfo(){
       return "Person"; 
    }
    public void printPerson(){
        System.out.println(getInfo());
    }
}
//getInfo method is private so no overriding is happening it print Person because get the person from the Person class as it is into the same class as the printPerson public method  