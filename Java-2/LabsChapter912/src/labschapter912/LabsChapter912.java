
package labschapter912;
// 9.12 and 9.13 labs
//public class LabsChapter912 {
class LabsChapter912 {
    public static void main(String[] args) {
       // A a = new A("Good"); worked fine without not arg constuctor dipsla good in output
        A a = new A();  //No arg is passed so no arg constructur is required where null will be displayed
        a.print();
        
    }
}

class A {
    String s;
    
    A(String newS) {  //String argument constructor when the instantiation is done using no arg one.
        s = newS;
    }
/* 9.12 Constructor "A" need to be created without argment. Tjat os the reason why the 
instance object variable "a" is never createted */
    A() { // No arg constructor required. This one was added
    }
    public void print(){
   
        System.out.println(s);
    }
}