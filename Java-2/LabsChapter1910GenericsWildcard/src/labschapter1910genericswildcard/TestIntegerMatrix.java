/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1910genericswildcard;

public class TestIntegerMatrix {
  //Create ineger arrays m1 , m2
    Integer[][] m1 = new Integer[][]{{1,2,3},{4,5,6},{1,1,1}};
    Integer[][] m2 = new Integer[][]{{1,1,1},{2,2,2},{0,0,0}};
  
//Create instance of integerMatrix
    IntegerMatrix integerMatrix = new IntegerMatrix();
    
    System.out.println("\nm1 + m2 is ");
    LabsChapter1910GenericsWildcard.printResult(m1,m2, integerMatrix.addMatix(m1,m2), '+');
    
     System.out.println("\nm1 + m2 is ");
    LabsChapter1910GenericsWildcard.printResult(m1,m2, integerMatrix.multiplyMatix(m1,m2), '*');
   }  
}
