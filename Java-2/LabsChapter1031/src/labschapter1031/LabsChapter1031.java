/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1031;

public class LabsChapter1031 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");
        
        System.out.println(s1.append(" is fun "));
        System.out.println(s1.append(s2));
        System.out.println(s1.insert(2, "is fun"));
        System.out.println(s1.insert(1, s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.deleteCharAt(3));
        System.out.println(s1.delete(1,3));
        System.out.println(s1.reverse());
        System.out.println(s1.replace(1, 3,"Computer"));
        System.out.println(s1.substring(2));
    }
    
}
