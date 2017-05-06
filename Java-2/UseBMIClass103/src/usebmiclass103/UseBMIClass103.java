/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebmiclass103;

public class UseBMIClass103 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang",18,14,70);
            System.out.println("The BMI for " + bmi1.getName() + " is " 
                    + bmi1.getBMI() + " " + bmi1.getStatus());
            
        BMI bmi2 = new BMI("Sussan King",215,70);
            System.out.println("The BMI for " + bmi2.getName() + " is " 
                    + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
         
