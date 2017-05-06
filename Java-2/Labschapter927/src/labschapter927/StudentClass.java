/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter927;

import java.text.ParseException;

public class StudentClass {
     public static void main(String[] args) throws ParseException {
        
     //  Student student = new Student();
       Student student = new Student(12231212, "John");
    
      System.out.print("Result :" + student.id + " " + student.name + " " + student.dateCreated);
     }
  }

// Student student = new Student(12231212,"John",  new java.util.Date(System.currentTimeMillis()));
// java.util.Date dateCreated = student.getDateCreated();
// student.dateCreated = student.getDateCreated();
// student.dateCreated.setTime(2000000);