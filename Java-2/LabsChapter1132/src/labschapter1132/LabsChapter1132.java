/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1132;

import java.util.ArrayList;

public class LabsChapter1132 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before Removing");
        System.out.println(list);
        System.out.println(" ");
        System.out.println("After Removing");
        list.remove(1);
        System.out.println(list);
    }
    
}
//the result is 1 and 3 because it is removing by index instead of by element