/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1140removedubplicatesarraylist;

import java.util.ArrayList;

public class LabsChapter1140RemoveDubplicatesArrayList {
    public static void main(String[] args) {
    ArrayList<String> lst = new ArrayList<String>();
    lst.add("ABC");
    lst.add("ABC");
    lst.add("ABCD");
    lst.add("ABCD");
    lst.add("ABCE");

    System.out.println("Duplicates List " + lst);

    Object[] st = lst.toArray();
      for (Object s : st) {
        if (lst.indexOf(s) != lst.lastIndexOf(s)) {
            lst.remove(lst.lastIndexOf(s));
         }
      }

    System.out.println("Distinct List "+ lst);
    }
}