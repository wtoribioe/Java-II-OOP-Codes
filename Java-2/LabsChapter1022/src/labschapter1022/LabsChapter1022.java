/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1022;

public class LabsChapter1022 {
    private String text;
    
    public LabsChapter1022(String str) {
       // String text = str; NullPointerException occured
        this.text = str; //this is the correct implementation
    }
    public static void main(String[] args) {
        Test test = new Test("ABC");
        System.out.println(test.text.toLowerCase());
    }
}
