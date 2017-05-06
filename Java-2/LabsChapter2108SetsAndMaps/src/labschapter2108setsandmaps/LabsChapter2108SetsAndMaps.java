/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2108setsandmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LabsChapter2108SetsAndMaps {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        System.out.println("\nCreate a HashMap");
        hashMap.put("Lizandro",20);
        hashMap.put("Gabriela",25);
        hashMap.put("JesusMiguel",35);
        hashMap.put("Dorian",40);
        hashMap.put("Kimberlee",50);
        hashMap.put("Pamela",50);
        hashMap.put("Albania",50);
        
        //Display entries in the HashMap
        System.out.println("Display entries in the HashMap in random order");
        System.out.println(hashMap + "\n");
        
        //Create a TreeMap from the preceeding HasMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Create a TreeMap from the preceeding HasMap");
       
        //Display entries in the TreeMap
        System.out.println("Display entries in the TreeMap -Comparable is used to order elements by key-");
        System.out.println(treeMap + "\n");
        
        //Create a LinkedHashMap
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        System.out.println("Create a LinkedHashMap in order as created");
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Lewis",10);
        linkedHashMap.put("Cook",15);
        
        //Display the age for Lewis
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap + "\n");
    }
}
