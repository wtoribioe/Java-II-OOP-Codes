/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter126;

public class LabsChapter126 {

    public static void main(String[] args) throws Exception{
        for (int i = 0; i <= 5; i++){
            System.out.print(i + " ");
            try {
                System.out.print(1 / 0);
            }
            catch (Exception ex) {
        }
    }
  }
}
