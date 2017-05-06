/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1132constructorchaing;

//public class OverRidingMethod {
 //   public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}
class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}
class A extends B {
    //**This methoid (A) Overides the method in (B) so (B)'s method as preference then output is equal 10.0 and 10.0 
    @Override
    public void p(double i) {
        System.out.println(i);
    }
}