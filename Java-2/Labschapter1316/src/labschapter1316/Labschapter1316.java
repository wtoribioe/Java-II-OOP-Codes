/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1316;

interface Labschapter1316 {
    void m1();
}
class B implements Labschapter1316 {
    @Override
    public void m1() {
        System.out.println("m1");
    }
} 