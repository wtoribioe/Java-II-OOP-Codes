/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2108asetsandmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LabsChapter2108aSetsAndMaps {
    public static void main(String[] args) {
       //HashMap<String,String> map = new LinkedHashMap<>();
       //HashMap<String,String> map = new HashMap<>();
       Map<String,String> map = new LinkedHashMap<>();
       map.put("123","John Smith");
       map.put("111","George Smith");
       map.put("123","Steve Yao");
       map.put("232","Steve Yao");
       map.put("222","Wilfrido Toribio");
       
       System.out.println("(1)HashMap " + map); //Urdered list
       
       System.out.println("(2)TreeMap " + new TreeMap<String,String>(map)); // Order the list by key
    }
}
