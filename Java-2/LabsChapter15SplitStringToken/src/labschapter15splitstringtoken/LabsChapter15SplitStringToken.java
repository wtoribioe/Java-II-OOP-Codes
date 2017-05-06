/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter15splitstringtoken;

public class LabsChapter15SplitStringToken {
    public static void main(String[] args) {
        
      // String str = " Hello, I'm, your String, splited to, a tokens";
       String str = " Hello I'm your String splited to a tokens";
       // String[] splitStr = str.split(""); //Split by character
       // String[] splitStr = str.split(","); //Split by CSV commas
       //String[] splitStr = str.split("\\s+");  //Java String.split() method is based upon regular expressions ("\\s+")
       String[] splitStr = str.split("\\s+"); // Similar to the REGEX ("\\s+")
       for (int i = 0; i < splitStr.length -1; i++) {
           System.out.println(i + " " + splitStr[i]);
       }
    }
}
