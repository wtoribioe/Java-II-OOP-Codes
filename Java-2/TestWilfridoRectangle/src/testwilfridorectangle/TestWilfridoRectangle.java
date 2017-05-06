
package testwilfridorectangle;
/** Assignment #1 Task 9.1 */
/**author Wilfrido Toribio Espinosa */

public class TestWilfridoRectangle {
    public static void main(String[] args) {
        /**Display the  Width, Height, Area of the first rectangle */
        WilfridoRectangle rectangle1 = new WilfridoRectangle();
        System.out.println("The Rectangle #1 has the default width = " + rectangle1.width + " Height = " + rectangle1.height + " Area = " + rectangle1.getArea() + " Perimeter = " + rectangle1.getPerimeter());
                
        /**Display the  Width, Height, Area of the second rectangle */
        WilfridoRectangle rectangle2 = new WilfridoRectangle(4,40);
        System.out.println("The Rectangle #2 has the width = " + rectangle2.width + " Height = " + rectangle2.height + " Area = " + rectangle2.getArea() + " Perimeter = " + rectangle2.getPerimeter());
       
        /**Display the  Width, Height, Area of the third rectangle */
        WilfridoRectangle rectangle3 = new WilfridoRectangle(3.5,35.9);
        System.out.println("The Rectangle #3 has the width = " + rectangle3.width + " Height = " + rectangle3.height + " Area = " + rectangle3.getArea() + " Perimeter = " + rectangle3.getPerimeter());
        
        /**Display the  Width, Height, Area of the four rectangle */
        WilfridoRectangle rectangle4 = new WilfridoRectangle(3,35);
        System.out.println("The Rectangle #4 has the width = " + rectangle4.width + " Height = " + rectangle4.height + " Area = " + rectangle4.getArea() + " Perimeter = " + rectangle4.getPerimeter());                                             
    }
}
/**Define the Rectangle class with two constructors */
class WilfridoRectangle {
    double width;
    double height;
    
 /**Define first constructors with default values */
 WilfridoRectangle(){
     width = 1;
     height = 1;
}     
  /**Define second constructors with specified values */
 WilfridoRectangle(double newWidth, double newHight){
     width = newWidth;
     height = newHight;
} 
 /**Return the Area */
double getArea(){
    return width * height;
}
/**Return the Perimeter */
double getPerimeter() {
    return 2 * width + 2 * height;
}    
/**Set new Area */
void setWidth(double newWidth) {
    width = newWidth;
}
/**Set new Perimeter*/
void setHeight(double newHeight) {
    height = newHeight;
   }
}
