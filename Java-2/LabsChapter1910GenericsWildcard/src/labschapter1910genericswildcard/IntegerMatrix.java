/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1910genericswildcard;

public abstract class IntegerMatrix extends LabsChapter1910GenericsWildcard<Integer> {
    @Override //add two integers
  protected Integer add(Integer o1, Integer o2) {
      return o1 + o2;
  }
 //   @Override //Multiply two Integers
    protected Integer multiply(Integer o1, Integer o2) {
         return o1 * o2;
    }
  @Override // Specify zero for an integer
  protected Integer zero() {
      return 0;
  }
}
