/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1510javafx;

import java.util.Observable;
import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class LabsChapter1510JavaFX  {
    
    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        
        balance.addListener(new InvalidationListener() {
        public void invalidated(Observable ov) {
            System.out.println("The new value is " + 
                balance.doubleValue());
        }
    });
    balance.set(4.5);
  }
}