package labschapter925;
//9.25b
public class Labschapter925b {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println("Before swap: a[0] = " + a[0] + " a[1] = " + a[1]);
        swap(a);
        System.out.println("After swap: a[0] = " + a[0] + " a[1] = " + a[1]);
    }
    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
