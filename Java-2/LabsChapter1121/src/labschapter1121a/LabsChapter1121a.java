/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1121a;

public class LabsChapter1121a {
    public static void main(String[] args) {
        new Persons().printPerson();
        new Students().printPerson();
    }
}
class Students extends Persons {
    @Override
    public String getInfo() {
        return "Student - With Override"; // Then after executing the Person's method return back to Students method wich is executed to printStudent through Person's method
    }
}
class Persons {
    public String getInfo(){
       return "Person";      
    }
    public void printPerson(){
        System.out.println(getInfo());  //This method is executed first due the extends clause "Person is printedout because no change is present in the implementtion
    }                                   // so @Override did not change anything here.
}

//getInfo method is public so overriding happen 
        