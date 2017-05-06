/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1901genericstack;

public class TestGenericStack {
    public static void main(String[] args) {
        
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Italy");
        stack1.push("Germany");
        stack1.push("Russia");
        stack1.push("France");
        stack1.push("Berlin");
        stack1.push("Paris");
       
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        stack2.push(50);
        stack2.push(60);
        stack2.push(70);
        
        System.out.println(" Stack1 String Generic ArrayList");
        System.out.println(stack1);
     //   for (int i = 0; i < stack1.getSize() - 1; i++) {
     //       System.out.println(stack1.get(i));
        
        System.out.println(" ");
        System.out.println(" Stack2 Integer Generic ArrayList");
        System.out.println(stack2);
        }
   }