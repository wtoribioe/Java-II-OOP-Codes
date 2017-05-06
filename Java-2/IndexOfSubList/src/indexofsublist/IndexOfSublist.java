/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexofsublist;
import java.util.*;

public class IndexOfSublist {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      
      List sublist = Arrays.asList("three Four".split(" "));
      System.out.println("SubList :"+sublist);
      System.out.println(
         "indexOfSubList: " + Collections.indexOfSubList(list, sublist));
      
      System.out.println(
         "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
   }
}