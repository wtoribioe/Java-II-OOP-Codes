/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse105;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCourseArrayList {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option1 = new String("L");
        String option2 = new String("A");
        String option3 = new String("R");
        String option4 = new String("M");
        String option5 = new String("E");
        
        CourseArrayList course1 = new CourseArrayList("1 Data Structure");
        CourseArrayList course2 = new CourseArrayList("2 Database System");
        CourseArrayList course3 = new CourseArrayList("4 Database Modeling");
         
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("anne Kennedy");
        course1.addStudent("Kimberlee Toribio");
        course1.addStudent("Hilda Pamela Toribio");
        course1.addStudent("DorianToribio");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smiths");
        course2.addStudent("Kimber Toribio");
        course2.addStudent("LizandroToribio");
        
        course3.addStudent("Peter Jones");
        course3.addStudent("Steve Smiths");
        course3.addStudent("Kimber Toribio");
        course3.addStudent("Dorian Toribio");
        course3.addStudent("GabrielaToribio");
        
        System.out.println(course1.getCourseName());
        System.out.println("Number of student in course1: " +
                course1.getNumberOfStudents());
        ArrayList<String> students = course1.getStudents();
        System.out.println("List of students enrolled in course :\n" 
                + course1.courseName + " " + course1.studentsList);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(course2.getCourseName());
        System.out.println("Number of students in course2: " +
               course2.getNumberOfStudents());
        System.out.println("List of students enrolled in course :\n " 
                + course2.courseName + " " + course1.studentsList);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(course3.getCourseName());
        System.out.println("Number of students in course : " +
               course3.getNumberOfStudents());
        System.out.println("List of students enrolled in course :\n " 
                + course3.courseName + " " + course1.studentsList);
        
        //Entering student data to ADD or REMOVE from the course list
        System.out.println(" ");
        System.out.println("Menu Options");
        System.out.println("1: Add ");
        System.out.println("2: Remove ");
        System.out.println("3: Modify ");
        int option = input.nextInt();
        System.out.println("Enter the course number :");
        int course = input.nextInt();
        System.out.print("Enter the student name to be ADDED or REMOVED : ");
        String name =  input.next();
        
        //Removinmg students 
        if ((option == 9) && (course == 1)){
               course1.dropStudent(name);
               System.out.println("Current list of students enrolled in course :\n " 
                       + course1.courseName + " " + course1.studentsList);
        }
        if ((option == 9) && (course == 2)){
               course2.dropStudent(name);
               System.out.println("Current list of students enrolled in course :\n " 
                       + course3.courseName + " " + course2.studentsList);
        }
        if ((option == 9) && (course == 3)){
               course3.dropStudent(name);
               System.out.println("Current list of students enrolled in coruse :\n" 
                       + course3.courseName + " " + course3.studentsList);
        }
        
        //Adding students 
        if ((option == 0) && (course == 1)){
               course1.addStudent(name);
               System.out.println("Current list of students enrolled in :\n " 
                       + course1.courseName + " " + course1.studentsList);
        }
        if ((option == 0) && (course == 2)){
               course2.addStudent(name);
               System.out.println("Current list of students enrolled in :\n " 
                       + course2.courseName + " " + course2.studentsList);
        }
        if ((option == 0) && (course == 3)){
               course3.addStudent(name);
               System.out.println("Current list of students enrolled in :\n " 
                       + course3.courseName + " " + course3.studentsList);
        }  
   }
} 