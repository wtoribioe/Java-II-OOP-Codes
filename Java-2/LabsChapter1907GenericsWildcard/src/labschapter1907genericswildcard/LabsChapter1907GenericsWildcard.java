/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1907genericswildcard;

import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.max;
import static labschapter1907genericswildcard.LabsChapter1907GenericsWildcard.max;

public class LabsChapter1907GenericsWildcard {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        System.out.print("The max numer is " + max(intStack));
    }
    //Find the maximun number in a stack of numbers
    public static double max(GenericStack<Number> stack) {
        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;
    }    
}
