
package labschapter925;
//9.25a
public class Labschapter925a {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println("Before swap: a[0] = " + a[0] + " a[1] = " + a[1]);
        swap(a[0],a[1]);
        System.out.println("After swap:  a[0] = " + a[0] + " a[1] = " + a[1]);
    }
    public static void swap(int n1, int n2) {  
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
