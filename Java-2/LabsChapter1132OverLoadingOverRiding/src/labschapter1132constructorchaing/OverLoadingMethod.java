/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1132constructorchaing;

public class OverLoadingMethod {
 public static void main(String[] args) {
        AA aa = new AA();
        aa.p(10);
        aa.p(10.0);
    }
}
class BB {
    public void p(double i) {
        System.out.println(i * 2);
    }
}
class AA extends B {
    //**This methoid (AA) Overload the method in (B) so the output is 10 and 20.0 
    public void p(int i) {
        System.out.println(i);
    }
}   
