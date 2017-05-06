/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter10103;

public class LabsChapter10103 {

    public static void main(String[] args) {
        System.out.println("===== Regular Expression available in regex java class =======");
        System.out.println("Welcome".replace("e", "A"));
        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replaceAll("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
        
        System.out.println("==========================");
        System.out.println("Java is fun");
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        
        System.out.println("==========================");
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));
        // "//d represent a siguel digit and //d{3} represent four digits
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
        
        System.out.println("==========================");
        String str = "a+b$#c".replaceAll("[$+#]","NNN");
        System.out.println(str);
        
        System.out.println("==========================");
        // : and :: mean OR. split the token input string when ., OR ? appear and put into an array of string called token
        String[] token = ("Java.C?C#,C++").split("[.,::?]"); 
        for (int i= 0; i < token.length; i++)
            System.out.println(i + " " + token[i]);
        //regex class is available for writting up regular expression in java
        System.out.println("==========================");
        // : and :: mean OR. split the token input string when ., OR ? appear and put into an array of string called token
        String[] token1 = ("Java%C&C#@C++").split("[%&::@]"); 
        for (int i= 0; i < token.length; i++)
            System.out.println(i + " " + token[i]);
        
        System.out.println("===== Conversion between String and arrays=======");
        char[] charstr = "Java".toCharArray();
        for (int i= 0; i < charstr.length; i++)
            System.out.println(i + " " + charstr[i]);
        
        System.out.println("==========================");
        String str1 = "Java is fun and cool";
        char[] strArray = str1.toCharArray();
        for (int i= 0; i < strArray.length; i++)
            System.out.println(i + " " + strArray[i]);
    
        System.out.println("==========================");
        char[] dst = {'J','A','V','A','1','3','0','1'};
        // "CS3720".getChars(srcBegin, srcEnd, dst, dstBegin);
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println(dst);
        System.out.println("==========================");
        for (int i= 0; i < dst.length; i++)
            System.out.println(i + " " + dst[i]);
        System.out.println("==========================");
        int str2 = String.valueOf(5.44);
        System.out.println(String.valueOf("5.44"));
    }
}
