/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1110;

public class LabsChapter1110 {
    public static void main(String[] args) {
        Object fruit = new Fruit();
        Object apple = new (Apple)fruit;
    }
}
class Apple extends Fruit {
    int f = 0;
}
class Fruit {
    
}