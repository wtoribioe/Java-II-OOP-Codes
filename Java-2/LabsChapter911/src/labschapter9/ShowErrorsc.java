
package labschapter9;
 // ShowErrorsc (c) 
public class ShowErrorsc {
    public void method1() {
        Circle c;
       // System.out.println("What is radius " + c.getRadius);
        c = new Circle();
        System.out.println("What is radius " + c.getRadius());
    } 
    /* Show Error (b) the "x" method was invoked in the program(b) when it did not exist. So it need to be created 
    here where t is being */
    void x() {
    }
}

class Circle {
    int radius = 2;
    int getRadius() {
        return
