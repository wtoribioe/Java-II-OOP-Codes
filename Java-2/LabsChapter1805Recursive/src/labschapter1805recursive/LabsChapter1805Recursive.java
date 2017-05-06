/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1805recursive;

import static java.util.Arrays.sort;

public class LabsChapter1805Recursive {

    public static void sort(double[] list) {
        sort(list,0,list.length -1); //sort the entire list
    }
    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low +1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            //Swap tge smallest in list[low .. high] with list [low]
            list[indexOfMin] = list[low];
            list[low] = min;
            
            //Sor the remaining list[low+1 ..high]
            sort(list,low +1,high);
        }
    }
}
