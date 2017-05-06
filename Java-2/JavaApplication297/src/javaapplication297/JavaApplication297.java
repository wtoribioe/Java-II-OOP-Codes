/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication297;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import static javafx.scene.input.KeyCode.A;

public class JavaApplication297 {
  public static void main(String[] args) {
       Set<A> set = new HashSet<A>();
        set.add(new A());
        set.add(new A());
        set.add(new A());
        set.add(new A());
        System.out.println(set);
    }
}

class A  {
    int r = 1;

    public String toString() {
        return r + "";
    }

    public boolean equals(Object o) {
        return this.r == ((A)o).r;
    }

    public int hashCode() {
        return r;
    }
}
       
  