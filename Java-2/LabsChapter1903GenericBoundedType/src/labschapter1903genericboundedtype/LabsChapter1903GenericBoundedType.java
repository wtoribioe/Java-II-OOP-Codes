/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1903genericboundedtype;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class LabsChapter1903GenericBoundedType {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,2);
        Circle circle = new Circle(2);
        
        System.out.println("Same area? " + equalArea(rectangle,circle));
        
    }
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }
    
}
