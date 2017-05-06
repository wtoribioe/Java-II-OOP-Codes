/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

import java.util.Date;

public class SimpleGeometricObject {
    String color = "White";
    boolean filled;
    private java.util.Date dateCreated;
    
    //** Construct a default geometric object */
    public SimpleGeometricObject () {
        dateCreated = new java.util.Date();
    }
    /** Construct a geometric object with specified color and filled value*/
    public SimpleGeometricObject( String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //** Return color */
    public String getColor(){
        return color;
    }
    //** Set a new color */
    public void setColor(String color){
        this.color = color;
    }
    //** Return filled, since filed is boolean its getter method is named isFilled */
    public boolean isFilled(){
        return filled;
    }
    //** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    //** Return a string representation of this color */
    @Override //Overrided from the super class java.util.lang.Object
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
