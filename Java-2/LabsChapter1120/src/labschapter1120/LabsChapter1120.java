/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1120;

import static java.sql.DriverManager.println;
import java.util.ArrayList;

public class LabsChapter1120 {

    public static void main(String[] args) {
        Integer [] list1 = {12,24,55,1};
        Double[] list2 = {12.4,24.0,55.2,1.0};
        int[] list3 = {1,2,3};
        printArray(list1);
        printArray(list2);
        printArray(list3); //Type array incompatible can not be converted to an Object - list3 array is privitive time one
    }
    public static void printArray(Object[] list){
        for (Object ob: list)
            System.out.print(ob + " ");
        System.out.println(" ");
    }

}
