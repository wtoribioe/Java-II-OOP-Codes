/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter9;
 // ShowErrors (d) 
public class ShowErrorsd {
    public static void main(String[] args) {
        C c = new C(5.0);
       System.out.println(c.value);
    }
}

class C {
    int value = 2;

public C(double d) {
    }
}