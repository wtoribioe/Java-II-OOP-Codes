/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1032;

import static java.util.stream.DoubleStream.builder;

public class LabsChapter1032 {

    public static void main(String[] args) {
        String str = "Java";
        StringBuilder builder = new StringBuilder(str);
        change(str,builder);
        
        System.out.println(str);
        System.out.println(builder);
    }
    private static void change(String str, StringBuilder builder){
        str = str + " and HTML";
        builder.append(" and  HTML");
    }
}
