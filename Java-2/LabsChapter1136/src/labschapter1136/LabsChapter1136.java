/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1136;
import java.util.ArrayList;

public class LabsChapter1136 {

    public static void main(String[] args) {
        private  ArrayList<Object> objectList = new ArrayList<>();
        
        public boolean isEmpty() {
            return objectList.isEmpty();
        }
        public int getSize() {
            return objectList.size();
        }
        public Object peek(){
            return objectList.get(getSize() -1);
        }
        public Object pop() {
            Object ob = objectList.get(getSize() - 1);
            objectList.remove(getSize() - 1);
            return 0;
        }
        public void push(Object ob){
            objectList.add(ob);
        }
        @Override
        public String toString(){
            return "Stack: " + objectList.toString();
        }
    }
    
