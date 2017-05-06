/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1132;

import java.util.ArrayList;

public class LabsChapter1132 {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Dallas");
        cityList.add("Dallas");
        cityList.add("Huston");
        cityList.add("Dallas");
        
        System.out.println("ArrayList before removing duplicated elements");
        System.out.println(cityList);
        System.out.println(" ");
        System.out.println("ArrayList after removing duplicated elements");
     
        for (int i = 0; i <= cityList.size()-1; i++)
            if (cityList.contains("Dallas")) cityList.remove("Dallas");
        System.out.println(cityList);
    }
    
}
