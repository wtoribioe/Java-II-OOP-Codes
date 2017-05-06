/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkingpractices3;


public class TestKingPractices3 {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        String str3 = str2;
    //  if (str1.equals(str3)) {
        if (str1.equalsIgnoreCase(str3)) {  //Display Equial the others statements commeted display Not Equal
    //  if (str1 == str3) {
            System.out.println("Equal");
        }else
            System.out.println("Not Equal");
    
       
    }
}
