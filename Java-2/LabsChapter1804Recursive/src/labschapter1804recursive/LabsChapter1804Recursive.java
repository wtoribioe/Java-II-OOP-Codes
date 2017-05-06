/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1804recursive;

public class LabsChapter1804Recursive {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s,0,s.length() -1);
    }
    public static boolean isPalindrome(String s,int low, int high) {
        if (s.length() <= low) //base case
            return true;
        else if (s.charAt(low) != s.charAt(high)) //base case
            return false;
        else
            return isPalindrome(s,low + 1,high -1);
}
    public static void main(String[] args) {
        System.out.println("Is moon a aplindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a aplindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a Palindrome? " + isPalindrome("abs"));
        System.out.println("Is ab a Palindrome? " + isPalindrome("ab"));
    }
}
