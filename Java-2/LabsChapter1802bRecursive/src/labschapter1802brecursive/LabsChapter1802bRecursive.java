/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1802brecursive;

public class LabsChapter1802bRecursive {

    public static void main(String[] args) {
        xMethod(123456789);
    }
    public static void xMethod(int n) {
        if(n != 0){
            System.out.print(n);
            xMethod(n / 10);
    }
  }
}
