package labschapter925;
//9.25d
public class Labschapter925d {
    public static void main(String[] args) {
        TTT t1 = new TTT();
        TTT t2 = new TTT();
        TTT t3 = new TTT();
        
        System.out.println(" t2's i = " + t1.i + " and  j = " + t1.j); 
        System.out.println(" t2's i = " + t2.i + " and  j = " + t2.j); 
        System.out.println(" t3's i = " + t3.i + " and  j = " + t3.j); 
      }
    }
class TTT {
    static int i = 0; //Static instance data file wich is shared amount all objects the class
    int j = 0; //j instance data field is no static so it hold values only by each object
    TTT() {
        i++;
        j++;
    }
}


