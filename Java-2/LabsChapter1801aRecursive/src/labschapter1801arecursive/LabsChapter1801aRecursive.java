/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1801arecursive;

public class LabsChapter1801aRecursive {

    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }
    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
}
