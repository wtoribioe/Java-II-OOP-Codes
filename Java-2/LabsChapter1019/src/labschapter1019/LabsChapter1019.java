/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1019;

public class LabsChapter1019 {
    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();
        
        System.out.println(stringBuilder.append("Welcome"));
        System.out.println(stringBuilder.append(' '));
        System.out.println(stringBuilder.append("to"));
        System.out.println(stringBuilder.append(' '));
        System.out.println(stringBuilder.append("Java"));
        System.out.println(stringBuilder.insert(11,"HTML "));
       
        System.out.println("==================================");
        System.out.println(stringBuilder.delete(8,11));
        System.out.println(stringBuilder.deleteCharAt(8));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(11,15,"HTML"));
       // System.out.println(stringBuilder.setCharAt(0,'w'));
        
        System.out.println("==================================");
        StringBuilder builder = new StringBuilder("Welcome 2343333");
        for (int i = 0; i < 14; i++)
            if (Character.isDigit(builder.charAt(i))) {
               System.out.println(i + " " + builder.append(builder.charAt(i)));
            } 
    }
}
