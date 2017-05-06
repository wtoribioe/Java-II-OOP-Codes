/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebmiclass103;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
     public BMI(String name, double weight, double height){
         this(name,20,weight,height);
    }
    public double getBMI(){
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5) 
            return "Undeweight";
        else if (bmi < 25) 
            return "Normal";
        else if (bmi < 30) 
            return "Overweight";
        else 
            return "Obese";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getheight(){
        return height;
  }
}