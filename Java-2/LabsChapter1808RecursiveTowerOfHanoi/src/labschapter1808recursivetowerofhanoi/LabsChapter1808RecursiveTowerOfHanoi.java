/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1808recursivetowerofhanoi;

import java.util.Scanner;

public class LabsChapter1808RecursiveTowerOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numer of disks: ");
        int n = input.nextInt();
        
        //find the solution recursively
        System.out.println("The moves are: ");
        moveDisks(n,'A','B','C');
    }
    //The method for finding the solution to move in disks
    //from fromTower toTower with auxTower
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) //Stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n -1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to "+ toTower);
            moveDisks(n -1, auxTower,toTower,fromTower); 
        }
    }
}
