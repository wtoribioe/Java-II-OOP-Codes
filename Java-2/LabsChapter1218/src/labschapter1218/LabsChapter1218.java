/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1218;

import java.util.ArrayList;
import java.util.Scanner;

public class LabsChapter1218 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url); 
    }
    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraverseURLs = new ArrayList<>();
        
        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraverseURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if(!listOfTraverseURLs.contains(urlString)) {
                listOfTraverseURLs.add(urlString);
                System.out.print("Craw " + urlString);
                
                for (String str : getSubURLs(urlString)) {
                    if (!listOfTraverseURLs.contains(str))
                     listOfPendingURLs.add(str);   
                }
            }
        }
    }
public static ArrayList<String> getSubURLs(String urlString) {
       ArrayList<String> list = new ArrayList<>();
       try {
        java.net.URL url = new java.net.URL(urlString);
        Scanner input = new Scanner(url.openStream());
        int current = 0;
        while (input.hasNext()) {
            String line = input.nextLine();
            current = line.indexOf("http:",current);
            while (current > 0) {
                int endIndex = line.indexOf("\"",current);
                if (endIndex > 0) {
                list.add(line.substring(current,endIndex));
                current = line.indexOf("http:",endIndex);
                } else
                    current = -1;
    }
  }
}
catch (Exception ex) {
    System.out.println("Error " + ex.getMessage());
}
return list;
 }
}