//The difference between passing a parameter of a primitive type and passing a parameter of reference type

package labschapter923;

// Labs 9.23 9.24 9.25 9.26
public class LabsChapter923 {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        
        for (int i = 0; i < 100; i++)
            increment(myCount,times);
        System.out.println("Count is " + myCount.count);
        System.out.println("Times is " + times);
    }
    public static void increment(Count c, int times) {
    c.count++;
    times++;
  }
}
