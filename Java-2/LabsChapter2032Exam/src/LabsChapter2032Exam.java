/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
//package labschapter2032exam;

public class LabsChapter2032Exam {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Peter", 65));
        list.add(new Student("Jill", 50));
        list.add(new Student("Sarah", 34));
        Collections.sort(list);
        System.out.print(list + " ");
        Collections.sort(list, new StudentComparator1());
        System.out.println(list);
    }

    static class StudentComparator1 implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
    return s1.name.compareTo(s2.name);
        }
    }

    static class Student implements Comparable<Student> {
        String name;
        int age;
        Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student s) {
    return this.age - s.age;
    }
    @Override
    public String toString() {
    return "[" + name + ", " + age + "]";
    }
  }
}
