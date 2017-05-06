/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter105arraylist;
/** This is an extract work from the Assignment #2 Task 10.2 Account class Design for ATM*/
/**Author Wilfrido Toribio Espinosa */

import java.util.ArrayList;
public class CourseArrayList {
    //*Creation of ArrayList:
    ArrayList<String> studentsList = new ArrayList<>();
    private int numberOfStudents;
    String courseName;
    
    public  CourseArrayList(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student) {
       //Adding students and incrementing counter
        this.studentsList.add(student);
        numberOfStudents++;

    }
    public ArrayList<String> getStudents(){
        return studentsList;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void dropStudent(String student){
       // List students before removing
       System.out.println("Course Name:" + this.courseName );
       System.out.println("Number of students: " +
                this.getNumberOfStudents());
       System.out.println("List of students: " + this.studentsList);
       System.out.println(" ");
       //Removing
       this.studentsList.remove(student);
       numberOfStudents--;
       //List of student after removing
       System.out.println("Course Name:" + this.courseName );
       System.out.println("Number of students: " +
                this.getNumberOfStudents());
       System.out.println("List of students: " + this.studentsList);
       System.out.println("** Removed ** ");
    }
    public void listStudent(CourseArrayList course){
       // Listing students by course
        System.out.println(" ");
        System.out.println("Course Name:" + this.courseName );
        System.out.println("Number of students: " +
                this.getNumberOfStudents());
        System.out.println("List of students: " + this.studentsList);
        System.out.println(" ** Enrolled ** ");
      
    }
}
 
