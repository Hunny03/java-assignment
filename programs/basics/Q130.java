// Q130
package basics;
import java.util.Scanner;
public class Q130 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Dono diagonals daalo: ");
        double d1 = kb.nextDouble();
        double d2 = kb.nextDouble();
        System.out.println("Rhombus ka area = "+(d1*d2/2));
    }
}
