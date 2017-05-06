/*
 Type of relationship always makes to understand how to reuse the feature from one class to another class. 
 In java programming we have three types of relationship they are.
• Is-A Relationship
• Has-A Relationship
• Uses-A Relationship
Is-A relationship
In Is-A relationship one class is obtaining the features of another class by using inheritance concept with extends keywords.
In a IS-A relationship there exists logical memory space.
 */
package isarelation;

class Faculty {  
    float salary = 30000;  
}  
class Science extends Faculty { 
    float bonous = 2000;
    
public static void main(String args[]){
    Science obj = new Science(); 
    System.out.println("Salary is: " + obj.salary);  
    System.out.println("Bonous is: " + obj.bonous);  
  }  
} 

