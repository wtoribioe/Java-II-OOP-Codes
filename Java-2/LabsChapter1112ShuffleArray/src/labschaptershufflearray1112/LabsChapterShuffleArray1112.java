/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschaptershufflearray1112;

/** Assignment #3 Task 11.3 Shufle Array List ***********
**  Author: Wilfrido Toribio Espinosa *********************
*********************************************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LabsChapterShuffleArray1112 {
    public static void main(String[] args) {
        String[] file1 = {"Wilfrido","Lizandro","Dorian","Jesus","Pamela","Kimberlee"};
        ArrayList<String> file1List = new ArrayList<>(Arrays.asList(file1));

        String[] file2 = {"BMW4","Mazda3","Toyota1","KIA4","Nissan5","Ford6"};
        ArrayList<String> file2List = new ArrayList<>(Arrays.asList(file2));

        //randomized fileList Array
        System.out.println("Before shuffling fileList");
        System.out.println("-------------------------");
        System.out.print(" ");
        for (String temp : file1) {
            System.out.print(temp + " ");
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("\nAfter shuffling fileList");
        System.out.println("-------------------------");
        System.out.print(" ");
        Collections.shuffle(file1List); 
        System.out.println(file1List);
        System.out.println(" ");
        
        //randomized imgList Array
        System.out.println("\nBefore shuffling imgList" );
        System.out.println("-------------------------");
        System.out.print(" ");
        for (String temp : file2) {
            System.out.print(temp + " ");
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("\nAfter shuffled imgList");
        System.out.println("-------------------------");
        System.out.print(" ");
        Collections.shuffle(file2List);
        System.out.println(file2List);
        System.out.println(" ");
        System.out.println("Printed using for loop ");
        System.out.println("-------------------------");
        for (int i = 0; i < file2List.size(); i++) {
		System.out.print(file2List.get(i) + " ");
    }
  }
}