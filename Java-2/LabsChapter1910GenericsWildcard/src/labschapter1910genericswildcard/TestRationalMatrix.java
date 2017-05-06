/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1910genericswildcard;
public class TestRationalMatrix {
    //Create two Rational arrays
    
    Rational[][] m1 = new Rational[3][3];
    Rational[][] m2 = new Rational[3][3];
    for (int i = 0; i < m1.length; i++) 
        for (int j= 0; j < m1[0].length(); j++) {
            m1[i][j] = new Rational(i + 1, j + 5);
            m2[i][j] = new Rational(i + 1, j + 6);
        }
    //Create an instance of RationalMatrix
    RationalMatrix rationalMatrix = new RationalMatrix();
    LabsChapter1910GenericsWildcard.printResult( m1,m2,rationalMatrix.addMatrix(m1,m2), '+');
    
    System.out.println("\nm1 * m2 is ");
    LabsChapter1910GenericsWildcard.printResult(m1,m2,rationalMatrix.muliplyMatrix(m1,m2), '*');
   }
}
