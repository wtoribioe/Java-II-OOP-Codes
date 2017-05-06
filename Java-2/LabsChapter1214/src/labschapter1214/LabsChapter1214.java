/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1214;

public class LabsChapter1214 {
    public static void main(String[] args) {
        try {
            int[] list = new int[10];
           //list = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("List[10] is " + list[10]);
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException ex) {
        //RuntimeException error happened because arrayIndexOutOfBound 
            System.out.println("RuntimeException");  
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
        System.out.println("After the catch continue next statement");
    }
    
}
