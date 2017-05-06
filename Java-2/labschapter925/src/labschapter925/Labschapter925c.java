

package labschapter925;
//9.25c
public class Labschapter925c {
    public static void main(String[] args) {
        TT t = new TT();
        System.out.println("Before swap: e1 = " + t.e1 + "  e2 = " + t.e2);
        swap(t);
        System.out.println("After swap : e1 = " + t.e1 + "  e2 = " + t.e2);
    }
    public static void swap(TT t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;         
      }   
    }
class TT {
    int e1 = 1;
    int e2 = 2;
}

