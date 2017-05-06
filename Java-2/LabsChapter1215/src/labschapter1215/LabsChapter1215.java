/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1215;

public class LabsChapter1215 {
        public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method ");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException"); //RuntimeException error happened because arrayIndexOutOfBound
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException");   
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
        static void method() throws Exception {
            System.out.println("dividing 1/0 " + 1 / 0);
        }
   }