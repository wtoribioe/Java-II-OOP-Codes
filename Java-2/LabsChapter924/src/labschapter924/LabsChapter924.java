
package labschapter924;

// 9.24
public class LabsChapter924 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        
        swap1(circle1,circle2);
        System.out.println("After calling swap1: circle1 = " + 
                circle1.radius + " circle2 = " + circle2.radius);
        
        swap2(circle1,circle2);
        System.out.println("After calling swap2: circle1 = " + 
                circle1.radius + " circle2 = " + circle2.radius);
    }
    public static void swap1(Circle x, Circle y){
    // swap1 cannot change instance data field values because is using static data field
        Circle temp = x;
        x = y;
        y = temp;
    }
    public static void swap2(Circle x, Circle y) {
    // swap2 was able to do the change because is changing instance data filed into a instance object
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
      }
}
    class Circle {
       double radius;
       
       Circle(double newRadius){
           radius = newRadius;
        }
    }