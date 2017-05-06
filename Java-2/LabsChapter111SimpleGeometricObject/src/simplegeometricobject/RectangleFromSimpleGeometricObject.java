/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;
    
    //**Default Constructor
    public RectangleFromSimpleGeometricObject() {
    }
    //** Constructor for specified Rectancle using their own datafile plus iheriting the default one defined in the supperclass
    public RectangleFromSimpleGeometricObject (double width, double height) {
        this.width = width;
        this.height = height;
    }
    //** Constructor for specified Rectancle allowing to change all datafiles for both subclass and superclass values */
    public RectangleFromSimpleGeometricObject (double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        super.setColor(color);     // method 
        super.setFilled(filled);  // method 
   }
    //** Return width */
    public double getWidth(double width) {
        return width;
    }
    //** set a new width */
    public void setWidth(double width) {
        this.width = width;
    }
    //**Return height */
    public double getHeight(double height){
        return height;
    }
    //** Set a new height */
    public void setHeight(double height){
        this.height = height;
    }
    //** Return area */
    public double getArea() {
        return width * height;
    }
    //** Retun Perimeter */
    public double getPerimeter(){
        return 2 * (width + height);
    }
}