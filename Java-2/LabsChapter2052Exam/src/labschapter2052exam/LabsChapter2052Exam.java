/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2052exam;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LabsChapter2052Exam {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(
        Arrays.asList(60, 10, 50, 30, 40, 20));

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}