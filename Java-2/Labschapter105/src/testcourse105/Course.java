/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse105;

public class Course {
    private String courseName;
    String[] students = new String[100];
    private int numberOfStudents;
     
    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        this.students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public String getCourseName() {
        return courseName;
    }
   public int getNumberOfStudents(){
     return numberOfStudents;
     
    }
   public void dropStudent(String student){
       // Left as an exercise in Programiong Exercisa 10.9
    }
}
