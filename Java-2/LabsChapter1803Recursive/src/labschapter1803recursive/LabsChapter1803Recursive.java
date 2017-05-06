/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1803recursive;

public class LabsChapter1803Recursive {
        public static boolean isPalindrome(String s) {;
        if (s.length() <= 1) //base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() -1)) //base case
            return false;
        else
            return isPalindrome(s.substring(1,s.length() - 1));
}
    public static void main(String[] args) {
        System.out.println("Is moon a aplindrome? " + isPalindrome("moon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a Palindrome? " + isPalindrome("abs"));
        System.out.println("Is ab a Palindrome? " + isPalindrome("ab"));
    }
}
