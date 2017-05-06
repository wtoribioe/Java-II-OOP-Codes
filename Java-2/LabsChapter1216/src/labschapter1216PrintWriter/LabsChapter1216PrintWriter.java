/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1216PrintWriter;

public class LabsChapter1216PrintWriter {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call"); //After the method() catch the error control is returned here an finished
        }           //From this point all the below statements are not executed 
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main"); 
        }
        catch (Exception ex) {
            System.out.println("Exception in main");  
        }
    }
        static void method() throws Exception {
            try {
               String str = "abc";
               System.out.println(str.charAt(3));
            }
            catch (RuntimeException ex) {
               System.out.println("RuntimeException in method()");  //RuntimeException happen due IndexOutOfBound error then program control is returned to the next statement after the method() 
            }
            catch (Exception ex) {
                 System.out.println("Exception in method()");
            }
            System.out.println("After the catch call");  // If a statement is here after to the catch then will be executed as well with the next one below the method() above
        }
   }