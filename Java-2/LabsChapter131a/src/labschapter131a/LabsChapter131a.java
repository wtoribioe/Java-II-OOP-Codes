/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter131a;

public class LabsChapter131a {
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

class A { 
    abstract void unfinished() {    //Incorrect implementation
  } 
}
public class abstract AA {  //Inccorrect implementation
    abstract void unfinished(); //abstract method in abstract class
} 
class AAA {  //Incorrect implementation
    abstract void unfinished() {      //abstract method in not abstract class
  } 
abstract class AAAA {                 //Correct implementation
    protected void unfinished();      //Incorrect constructor inplementation VOID
}
abstract class AAAAA {  //Correct implementation
    abstract void unfinished();
}
abstract class AAAAAA {  //Correct implementation
    abstract int unfinished();
}
