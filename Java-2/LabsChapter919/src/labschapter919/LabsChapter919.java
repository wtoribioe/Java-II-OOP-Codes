
package labschapter919;

// 9.19 lab
public class LabsChapter919 {
    public static void main(String[] args) {
        method1();
    }
    //    public "static" void method1() non static method can invoke a static contex
    public void method1() {
        method2();
    }
    // Static methdo (method2)can not access an instance method (c.getRadius)
    public sta tic void method2() {
        System.out.println("What is radius " + c.getRadius);
    }
    Circle c = new Circle();
}