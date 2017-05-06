/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter126a;

public class LabsChapter126a {
      public static void main(String[] args) {
        
            try {
                for (int i = 0; i < 5; i++){
                System.out.println(i + " ");
                System.out.println(1 / 0);
            }
        }
            catch (Exception ex) {
                System.out.println("WatchDog Catch Block (1 / 0)");
        }
            System.out.println("WatchDog End");
    }
  }
