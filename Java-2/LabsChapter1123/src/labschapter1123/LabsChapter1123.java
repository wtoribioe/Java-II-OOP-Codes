/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1123;

public class LabsChapter1123 {
    public static void main(String[] args) {
        new A();  //invoke A() constructor to execute action and method
        new B();  //invoke B() constructor to execute action and method
    }
}
class A {
    int i = 7;
    public A() {  //--> A() Constructor
        setI(20);
        System.out.println("i from A is " + i); //Constructor actions
    }
    public void setI(int i) {   //Method actions
        this.i = 2 * i;
  }
}
class B extends A {
    public B() { //--> B() Constructor
        System.out.println("i from B is " + i);  //constructor actions
    }
    @Override
    public void setI(int i) {  //Method actions
        this.i = 3 * i;
    }
}

//The result is that the first time A() constructor is executed and the setI() method is called to multiply 20 by 2 = 40 
//Then B() constructor is executed and first make the call to the A() constructor due the extends clause so A() constructor is OVERRIDED   by the B() constructor tp print 20 by 3 = 60
//Then extends clause that made the call to A() after doing the action there return the control to B() constructor to execute the operation of 20 by 3 = 60 as well.