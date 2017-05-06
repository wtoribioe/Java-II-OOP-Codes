/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse105;

public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("101 Data Structure");
        Course course2 = new Course("2202 Database System");
        Course course3 = new Course("1454 Database Modeling");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("anne Kennedy");
        course1.addStudent("Kimberlee Toribio");
        course1.addStudent("Hilda Pamela Toribio");
        course1.addStudent("Dorian Toribio");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smiths");
        course2.addStudent("Kimber Toribio");
        course2.addStudent("Dorian Toribio");
        
        course3.addStudent("Peter Jones");
        course3.addStudent("Steve Smiths");
        course3.addStudent("Kimber Toribio");
        course3.addStudent("Dorian Toribio");
        
        System.out.println(course1.getCourseName());
        System.out.println("Number of student in course1: " +
                course1.getNumberOfStudents());
        
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.println(i + ", " + students[i]);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(course2.getCourseName());
        System.out.println("Number of students in course2: " +
               course2.getNumberOfStudents());
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
            System.out.println(i + ", " + students[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(course3.getCourseName());
        System.out.println("Number of students in course2: " +
               course3.getNumberOfStudents());
        for (int i = 0; i < course3.getNumberOfStudents(); i++)
            System.out.println(i + ", " + students[i]);
      
        System.out.println(" ");
        System.out.println(" ");
        
     //   for (int j = 0; j > Course.students.length - 1; j++)
      //      System.out.println(j + ", " + students[j]);
    }
    
}
