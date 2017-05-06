/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter105arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabsChapter105ArrayList {
public static void main(String[] args) {
        String name = " ";int option = 0;int course = 0;
        Scanner input = new Scanner(System.in);
        
        CourseArrayList course1 = new CourseArrayList("1 Data Structure");
        CourseArrayList course2 = new CourseArrayList("2 Database System");
        CourseArrayList course3 = new CourseArrayList("3 Database Modeling");
         
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Kimberlee Toribio");
        course1.addStudent("Hilda Pamela Toribio");
        course1.addStudent("DorianToribio");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        course2.addStudent("Kimber Toribio");
        course2.addStudent("LizandroToribio");
        
        course3.addStudent("Peter Jones");
        course3.addStudent("Steve Smith");
        course3.addStudent("Kimber Toribio");
        course3.addStudent("Dorian Toribio");
        course3.addStudent("GabrielaToribio");
        
        System.out.println(" ");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Number of student: " +
                course1.getNumberOfStudents());
        ArrayList<String> students = course1.getStudents();
     //   System.out.println("Course Name: " + course1.courseName);
        System.out.println("List of students: " + course1.studentsList);
        
        System.out.println("-------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("Course Name: " + course2.getCourseName());
        System.out.println("Number of students: " +
               course2.getNumberOfStudents());
      //  System.out.println("Course Name: " + course2.courseName);
        System.out.println("List of students: " + course2.studentsList)        
        System.out.println("-------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("Course Name: " + course3.getCourseName());
        System.out.println("Number of students: " +
               course3.getNumberOfStudents());
     //   System.out.println("Course Name: " + course3.courseName);
        System.out.println("List of Students: " + course3.studentsList);
        
        //Entering student data to ADD or REMOVE from the course list
        try {
        System.out.println("------------------------------------------------- ");
        System.out.println(" ");
        System.out.println("Menu Options Students");
        System.out.println("1: Add ");
        System.out.println("2: Remove ");
        System.out.println("3: Modify ");
        System.out.println("4: Course list");
        System.out.println("9: Exit ");
        System.out.println("Select an option: ");
        option = input.nextInt();
        if ((option <= 0) || (option >= 9)) {
            System.out.println("Please Enter a valid number from the MENU");
            System.exit(0);
        }
        System.out.println("Enter the course number :");
        course = input.nextInt();
        if ((course <= 0) || (course >= 9)) {
            System.out.println("Please Enter a valid number from the MENU");
            System.exit(0);
        }
        if (option != 4) {
            System.out.print("Enter the student name : ");
            name =  input.next();
            System.out.println(" ");
            System.out.println(" ** Result **");
            }
        } 
        catch (InputMismatchException e) {
            System.out.print("Please Enter a valid number from the MENU " 
                    + e.getMessage()); //try to find out specific reason.
        }
        //Adding students 
        if ((option == 1) && (course == 1)){
               System.out.println("Course Name : " + course1.courseName);
               System.out.println("Number of students : " +
               course1.getNumberOfStudents());
               System.out.println("List of students: " + course1.studentsList);
               System.out.println(" ");
               course1.addStudent(name);
               System.out.println("Course Name : " + course1.courseName);
               System.out.println("Number of students : " +
               course1.getNumberOfStudents());
               System.out.println("List of students: " + course1.studentsList);
               System.out.println("** Added ** ");
        }
        if ((option == 1) && (course == 2)){
               System.out.println("Course Name : " + course2.courseName);
               System.out.println("Number of students : " +
               course2.getNumberOfStudents());
               System.out.println("List of students: " + course2.studentsList);
               System.out.println(" ");
               course2.addStudent(name);
               System.out.println("Course Name : " + course2.courseName);
               System.out.println("Number of students : " +
               course2.getNumberOfStudents());
               System.out.println("List of students: " + course2.studentsList);
               System.out.println("** Added ** ");
        }
        if ((option == 1) && (course == 3)){
               System.out.println("Course Name : " + course3.courseName);
               System.out.println("Number of students : " +
               course3.getNumberOfStudents());
               System.out.println("List of students: " + course3.studentsList);
               System.out.println(" ");
               course3.addStudent(name);
               System.out.println("Course Name : " + course3.courseName);
               System.out.println("Number of students : " +
               course3.getNumberOfStudents());
               System.out.println("List of students: " + course3.studentsList);
               System.out.println("** Added ** ");
        }  
        //Removinmg students 
        if ((option == 2) && (course == 1)){
               course1.dropStudent(name);
        }      
        if ((option == 2) && (course == 2)){
               course2.dropStudent(name);   
        }
        if ((option == 2) && (course == 3)){
               course3.dropStudent(name);  
        }
        
        //Modifying students 
        if ((option == 3) && (course == 1)){
               course1.addStudent(name);
        }
        if ((option == 3) && (course == 2)){
               course2.addStudent(name);    
        }
        if ((option == 3) && (course == 3)){
               course3.addStudent(name);     
        }  
        
        //Listing students 
        if ((option == 4) && (course == 1)){
               course1.listStudent(course1);
        }      
        if ((option == 4) && (course == 2)){
               course2.listStudent(course2);   
        }
        if ((option == 4) && (course == 3)){
               course3.listStudent(course3);
        }         
   }
} 