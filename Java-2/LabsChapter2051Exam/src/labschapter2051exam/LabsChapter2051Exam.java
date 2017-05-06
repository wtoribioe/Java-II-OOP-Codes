/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2051exam;

import java.util.*;

public class LabsChapter2051Exam {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(
            Arrays.asList(60, 10, 50, 30, 40, 20));

        for (int i: queue)
            System.out.print(i + " ");
    }
}