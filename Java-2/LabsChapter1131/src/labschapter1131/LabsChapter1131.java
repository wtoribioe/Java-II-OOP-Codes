/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1131;

import java.util.ArrayList;

public class LabsChapter1131 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Denver");
        strList.add("Austin");
        
        strList.add(new java.util.Date()); //args mismatch Date can not be converted to string
        String city = strList.get(0);  // no action is taken because different array
        strList.set(3,"Dallas");    // Will fail because Dallas index doesnt exist in the arraylist only index 0 and 1 are created for the first two elements
        System.out.println(strList.get(3));
        
        
    }
    
}
