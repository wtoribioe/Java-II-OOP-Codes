/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse105;

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
        this.studentsList.add(student);
        numberOfStudents++;
        System.out.println("List of students enrolled in all courses " 
                + this.studentsList);
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
       // Left as an exercise in Programiong Exercisa 10.9
       this.studentsList.remove(student);
       // Listing the students after removing
       System.out.println("Current list of students enrolled in :" + this.courseName + " " + this.studentsList);

    }
}
 
