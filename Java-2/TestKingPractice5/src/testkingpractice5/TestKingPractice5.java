/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkingpractice5;
class TestKingPractice5 {
        int r;
        TestKingPractice5(int r) {
        this.r = r;
      }
    }
class DVD extends TestKingPractice5 {
        int c;
        DVD(int r, int c) {
            super(r);      //Constructor chaning from parent class
            this.c = c;  
        }
    }
   
//Intatiating the Object DVD dvd = new DVD(10,20);  it worked just fine because super class (r) aguments is passed in nthe sub class