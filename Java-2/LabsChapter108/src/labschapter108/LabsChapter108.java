/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter108;
/** Can be the following statement compiled */

import java.util.*;
public class LabsChapter108 {

    public static void main(String[] args) {
        
        Integer i1 = new Integer("23");
        Integer i2 = new Integer(23);
        
        Integer i3 = new Integer.valueOf("23");
        Integer i4 = new Integer.perseInt("23", 8);
        Double d1 = new Double();
        Double d2 = new Double.valueOf("23.45");
        
        int j1 = (Integer.valueOf("23").intValue());
        double d3 = (Double.valueOf("23.4")).doubleValue();
        int j2 = (Double.valueOf("23.4")).intValue();
        String s = (Double.valueOf("23.4")).toString();
        
    }
}
