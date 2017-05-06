/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1023;

public class LabsChapter1023 {
    String text;
    
    public LabsChapter1023(String str){
        this.text = str;
    }
    public static void main(String[] args) {
        LabsChapter1023 test = new LabsChapter1023("ABC");
        System.out.println(test.text);
    } 
}
