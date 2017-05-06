/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1413javafxexam;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public abstract  class LabsChapter1413JavaFXExam extends Application {
    
public static void main(String[] args) {

    IntegerProperty d1 = new SimpleIntegerProperty(1);
    IntegerProperty d2 = new SimpleIntegerProperty(2);

    d1.bind(d2);

    System.out.print("d1 is " + d1.getValue()
    + " and d2 is " + d2.getValue());

    d2.setValue(3);

    System.out.println(", d1 is " + d1.getValue()
    + " and d2 is " + d2.getValue());

    }

}