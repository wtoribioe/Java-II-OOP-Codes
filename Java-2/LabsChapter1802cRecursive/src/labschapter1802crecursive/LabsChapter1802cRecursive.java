/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1802crecursive;

public class LabsChapter1802cRecursive {

    public static void main(String[] args) {
        xMethod(15);
    }
    public static void xMethod(int n) {
        if(n > 0){
            xMethod(n - 1);
            System.out.print(n + " ");
    }
  }
}
