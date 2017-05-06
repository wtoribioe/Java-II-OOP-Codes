/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2105asetsandmaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LabsChapter2105aSetsAndMaps {

    public static void main(String[] args) {
        //LinkedHashSet<String> set1 = LinkedHashSet<>();  // Wrong statement
        //HashSet<String> set01 = new HashSet<>(); //Correct statement
        //TreeSet<String> set02 = new TreeSet<>();  //Correct statement
        //Set<String> set02 = new TreeSet<>();  //Correct statement
        
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("New Your");
       // LinkedHashSet<String> set2 = set1;  //Wrong  statement
        Set<String> set2 = set1;
       // LinkedHashSet<String> set3 = (LinkedHashSet<String>)(set1.clone());
        Set<String> set3 = (LinkedHashSet<String>)(set1);
        set1.add("Atlanta");
        System.out.println("Set1 is " + set1);
        System.out.println("Set2 is " + set2);
        System.out.println("Set3 is " + set3);
    }
}
