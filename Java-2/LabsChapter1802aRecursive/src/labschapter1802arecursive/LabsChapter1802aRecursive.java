/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1802arecursive;

public class LabsChapter1802aRecursive {

    public static void main(String[] args) {
        xMethod(15);
    }
    public static void xMethod(int n) {
        if(n > 0){
            System.out.print(n + " ");
            xMethod(n - 1);
        }
    }
}
