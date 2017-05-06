/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1022;

public class Test {
    String text;
    
    public Test(String str) {
       // String text = s;   //Whe using this one NullPointerException error occured
         this.text = str;  //This one has the change to avoid this so instance variable is not being redefined 
    }
    public static void main(String[] args) {
        Test testObj = new Test("ABC");
        System.out.println(testObj.text.toLowerCase());
    }
}
