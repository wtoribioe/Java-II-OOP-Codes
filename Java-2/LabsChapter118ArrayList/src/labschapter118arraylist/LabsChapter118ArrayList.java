/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter118arraylist;
import java.util.ArrayList;
public class LabsChapter118ArrayList {

    public static void main(String[] args) {
        //Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();
        
        //Add some cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seul");
        cityList.add("Tokyo");
        
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Dember in the list is? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());
        
        //Insert new city from list
        cityList.add(2,"Xiam");
        cityList.add(4,"Dominicann");
        System.out.println(cityList);
        
        //Updating a city from list
        cityList.set(2,"Xiam Lung");
        cityList.set(4,"Dominicann Republic");
        System.out.println(cityList);
        
        //Remove a city at index 1
        cityList.remove(cityList.size()-1); //removing the very last element from the list
        System.out.println(cityList);
        
        //Display the containg of the list
        System.out.println(cityList.toString());
        
        ////Display the containg of the list in reverse order
        for (int i = cityList.size()-1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();
        
        //Create list to store two circle
     //   ArrayList<CircleFromSimpleGeometricObject> objectList = new ArrayList<>();
        
        //Add two circles
    //    objectList.add(new CircleFromSimpleGeometricObject(2));
     //   objectList.add(new CircleFromSimpleGeometricObject(3));
        
        //Display the area of the first circle in the list
     //   System.out.println("The area of the circle? "+ objectList.get(0).getArea());
    }
    
}
