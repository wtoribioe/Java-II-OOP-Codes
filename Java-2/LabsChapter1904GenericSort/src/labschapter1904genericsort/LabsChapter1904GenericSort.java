/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1904genericsort;

public class LabsChapter1904GenericSort {

    public static void main(String[] args) {
        //Create an Integer array
        Integer[] intArray = {new Integer(12),new Integer(20),new Integer(30),new Integer(54),new Integer(-76)};
        
        //Create Dobule array
        Double[] doubleArray = {new Double(12.53),new Double(20.54),new Double(30.63),new Double(54.69),new Double(-76.3)};
        
        //Create String array
        String[] stringArray = {"Red","Blue","Yellow","Green","Black"};
        
        //Create Character array
        Character[] characterArray = {new Character('a'),new Character('b'),new Character('c'),new Character('d'),new Character('e')};
        
        //Sort the arrays
        sort(intArray);
        sort(doubleArray);
        sort(stringArray);
        sort(characterArray);
        
        //Display sorted Array
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(characterArray);
        
    }
    //Sort an array of comparable objects
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMain;
        int currentMainIndex;
        
        for (int i = 0; i < list.length -1; i++) {
            //Find the minimun element in the list.[i]
            currentMain = list[i];
            currentMainIndex = i;
            
         for (int j = i + 1; j < list.length; j++) {
            if (currentMain.compareTo(list[j]) > 0) {
            currentMain = list[j];
            currentMainIndex = j;
        }
    }
        //Swap list[i] with list[currentMainIndex] if necessary
        if (currentMainIndex != i) {
            list[currentMainIndex] = list[i];
            list[i] = currentMain;
        }    
    }
}

    //Print an array of objects
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) 
             System.out.print(list[i] + " ");
         System.out.println();
        }
    }
