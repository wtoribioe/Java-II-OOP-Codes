/*
 Uses-A relationship
A method of one class is using an object of another class the relationship between these two classes is known as Uses-A relationship.
 */
package usesarelationship;

class Employee {
    float salary = 30000;  
}  
class Salary extends Employee {
public static  void disp(){
    float bonous = 1000;
    Employee obj = new Employee();
    float Total = obj.salary + bonous;
    System.out.println("Total Salary is: " + Total);  
    }
}
public class Developer  { 
public static void main(String[] args){
    Salary sal = new Salary();
    sal.disp();
    }  
} 

