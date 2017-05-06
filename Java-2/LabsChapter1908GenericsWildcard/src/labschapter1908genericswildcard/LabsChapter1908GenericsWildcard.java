/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1908genericswildcard;

public class LabsChapter1908GenericsWildcard {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        
        print(intStack);
    }
    public static print(GenericStack<?> stack) {
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
