
package labschapter9;

/** What is wrong on each program */
public class ShowErrorsa {
    public static void main(String[] args) {
        // ShowErrors (a) 
        ShowErrorsa t;
        t = new ShowErrorsa(5); 
    }
    // Show Error (a) need a constructor so class can be instantiated 
    private ShowErrorsa(int i) {
    }
}
