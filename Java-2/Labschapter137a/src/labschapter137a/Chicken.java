/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter137a;

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken Fry it"; 
    }
    @Override
    public String howToSound() {
        return "Checken: cock-a-doodle-doo";
    }

}
