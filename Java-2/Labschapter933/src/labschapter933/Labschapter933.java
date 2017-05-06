/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter933;
public class Labschapter933 {
   
        private int p;
        
        public Labschapter933() {
            this(0); //need to the first statement to work fine
            System.out.println("C's no arg constructor invoked ");
         //   this(0); //Wrong position of constructor statement
        }
        public Labschapter933(int p) {
            p = p;
        }
        public void setP(int p) {
            p = p;
        }        
    }
 