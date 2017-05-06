/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1909genericswildcard;

public class LabsChapter1909GenericsWildcard {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        add(stack1,stack2);
        
        LabsChapter1908GenericsWildcard.print(stack2);
    }
    //public static <T> void add(GenericStack<? extends T> stack1,GenericStack<T> stack2) {  // Similar syntac
    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }
}
 
