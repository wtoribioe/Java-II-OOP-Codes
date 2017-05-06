/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter915;
public class ClassC {
     private boolean x;
     
    public static void main(String[] args) {
       ClassC c = new ClassC();
       System.out.println(c.x);
       System.out.println(c.convert());
    }
    private int convert() {
        return x ? 1 : -1;
    }
}

  
