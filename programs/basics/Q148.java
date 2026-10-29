// Q148
package basics;
import java.util.Scanner;
public class Q148 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Total sale aur commission %: ");
        double sale = kb.nextDouble();
        double cp = kb.nextDouble();
        double com = sale*cp/100;
        System.out.println("Commission = "+com);
    }
}
