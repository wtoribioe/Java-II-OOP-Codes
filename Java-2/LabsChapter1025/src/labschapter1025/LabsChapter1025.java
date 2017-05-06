/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1025;

public class LabsChapter1025 {
    public static void main(String[] args) {
        //**Count only all the upper latter using isUpercase or lowerCase using isLowerCase
        String str = "Hi, Good Morning Guys Wilfrido";
        System.out.println(m(str));
    }
    public static int m(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        
        return count;
        
        }
    }
    