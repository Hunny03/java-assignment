// Q291
package inputoutput;
import java.util.Scanner;
public class Q291 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("true ya false daalo: ");
        boolean b = kb.nextBoolean();
        System.out.println("Tumne daala: "+b);
    }
}
