/*
Has-A relationship
In Has-A relationship an object of one class is created as data member in another class the relationship between these two classes is Has-A.
In Has-A relationship there existed physical memory space and it is also known as part of or kind of relationship.
 */
package hasarelationship;

class Employee {
float salary = 30000;  

}
public class Developer extends Employee { 
    static float bonous = 2000; 
public static void main(String args[]){
    Employee obj = new Employee();
    System.out.println("Salary is: " + obj.salary);
    }  
}  
