/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1506javafx;

public class LabsChapter1506JavaFX {
    public void main(String[] args) {
        LabsChapter1506JavaFX test = new LabsChapter1506JavaFX();
        test.setAction1(() -> System.out.print("Action 1! "));
        test.setAction2(e -> System.out.print(e + " "));
        System.out.print(test.setAction3(e -> e * 2));
}
public void setAction1(T1 t) {
    t.m();
}
public void setAction2(T2 t) {
    t.m(4.5);
}
public double setAction3(T3 t) {
    return t.m(5.5);
    }
}
interface T1  {
    public void m();
}
interface T2  {
    public void m(double d);
}
interface T3  {
    public double m(double d);
}