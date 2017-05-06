/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1909genericswildcard;

import java.util.ArrayList;

public class GenericStack <E> {  
    public ArrayList<E> list = new ArrayList<>();
    
    public  int getSize() {
        return list.size();
    }
     public  E peek() {
        return list.get(getSize() - 1);
    }
      public  void push(E obj) {
        list.add(obj);
    }
       public  boolean isEmpty() {
        return list.isEmpty();
    }
    @Override 
       public  String toString() {
        return "Stack: " + list.toString();
    }

    Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
