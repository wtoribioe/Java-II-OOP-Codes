/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter927;

import java.util.Date;

public class Student {
private int id;
private String name;
private Date dateCreated;

public Student () {
    id = 12231212;
    name = "John";
    dateCreated =  new Date();
}

public Student(int ssn, String newName, Date dateCreated) {
    id = ssn;
    name = newName;
    dateCreated = this.dateCreated;
}
    public int getId(){
        return id;
}
    public String getName(){
        return name;
}
    public Date getDateCreated(){
        return dateCreated;
        }
    }
