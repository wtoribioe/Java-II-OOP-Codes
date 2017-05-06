/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1319;

public class LabsChapter1319 {
    public static void main(String[] args) {
        Integer n1 = new Integer(5);
        Object n2 = new Integer(4);
     //   System.out.println(n1.compareTo(n2)); // need to be casted
        System.out.println(n1.compareTo((Integer)n2));
        
    }
    
}
