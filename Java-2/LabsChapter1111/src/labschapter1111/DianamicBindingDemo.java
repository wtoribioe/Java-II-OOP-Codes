/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1111;

public class DianamicBindingDemo {

    public static void main(String[] args) {
        private double radius;
        
        public DianamicBindingDemo(double radius) {
            this.radius = radius;
            
        }
        public double getRadius() {
            return radius;
        }
        public double getArea(){
            return radius * radius * Math.PI;
        }
}

class B extends DianamicBindingDemo {
    private double length;
   
    
    B(double radius, double length) {
       super.LabsChapter1111(radius);
       length = length;
    }
    @Override
    public double getArea() {
        return getArea() * length;
    }
}
