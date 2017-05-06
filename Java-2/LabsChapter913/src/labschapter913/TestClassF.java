/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter913;
public class TestClassF {
    public static void main(String[] args) {
        ClassF f = new ClassF();  //Intantiation was added
        
        System.out.println(f.i); //From 11 to 14 if a not args constructor is created with initialization of the instance variable worked fine
        System.out.println(f.s);
        f.imethod();
        f.smethod();
        System.out.println(F.i);  // from 15 to 18 need to instantiate the object with the class reference variable (F)
        System.out.println(F.s);
        F.imethdo();
        F.smethdo();
    }
}