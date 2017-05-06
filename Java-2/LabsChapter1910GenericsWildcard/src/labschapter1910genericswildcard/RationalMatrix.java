/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1910genericswildcard;

public  class RationalMatrix extends LabsChapter1910GenericsWildcard<Rational> {
    @Override // Add two rational numbers
    protected Rational add(Rational r1, Rational r2) {
        return r1.add(r2);
    }
    @Override // Multiply two rational numbers
    protected Rational multiply(Rational r1, Rational r2) {
        return r1.multiply(r2);
    }   
    @Override //Specify zero for a rational number
    protected Rational zero()) {
        return Rational(0,1);
    }
}
