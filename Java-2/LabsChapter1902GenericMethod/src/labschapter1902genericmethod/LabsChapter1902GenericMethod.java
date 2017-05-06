/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1902genericmethod;

public class LabsChapter1902GenericMethod {

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        String[] strings = {"London","Mexico","Canada","Brasil","Dominican"};
        
        //Either way used to call the Generic methdo
        LabsChapter1902GenericMethod.<Integer>printArray(integers);
        LabsChapter1902GenericMethod.<String>printArray(strings);
        //Or
        printArray(integers);
        printArray(strings);
    }
    // Declare a Generic Methdo static <E> void methdo-name()
    public static <E> void printArray(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            System.out.println();
        }
    }
}
