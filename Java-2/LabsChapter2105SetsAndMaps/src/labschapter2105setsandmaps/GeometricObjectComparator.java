/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2105setsandmaps;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {
    @Override
    public int compare(GeometricObject obj1, GeometricObject obj2) {
        double area1 = obj1.getArea();
        double area2 = obj2.getArea();
        
        if (area1 < area2) 
            return -1;
            else if (area1 == area2) 
                return 0;
            else
                return 1;
    } 
}
