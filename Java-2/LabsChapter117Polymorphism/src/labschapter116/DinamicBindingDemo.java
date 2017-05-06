/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter116;

public class DinamicBindingDemo{

    public static void main(String[] args) {
        //** The first call (m). call GraduateStudent then go to Student who move to person
        // Howeve, Person's method is overrided by the Student so Student is printout. */
        m(new GraduateStudent());
        //The second call (m). call Student then go to Person but Person's method is overrided by the Student so Student is printout again
        m(new Student()); 
        // The third call person only bue person go to object but there is nothing to do there so printout is printed out
        m(new Person());
        //The fourth call Object that print the data using default constructor weird output
        m(new Object());
    }
    public static void m(Object x) {
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student { 
}
class Student extends Person {
   @Override
    public String toString() {
        return "Student";
    }
}
class Person extends Object {
    @Override
    public String toString() {
        return "Person";    
    }
}
    
