/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1122;

public class LabsChapter1122 {

    public static void main(String[] args) {
        A a = new A(3);
    }
}
class A extends B {
    public A(int t) {
        System.out.println("A's constructor is invoked" + " " + t * 2);
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked"); // B's constructor is executed fist due the extends clause then return back to A's method to execute A's constructor
    }
}