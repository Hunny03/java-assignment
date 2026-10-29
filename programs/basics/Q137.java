// Q137
package basics;
import java.util.Scanner;
public class Q137 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Length, width, height: ");
        double l = kb.nextDouble();
        double w = kb.nextDouble();
        double h = kb.nextDouble();
        double sa = 2*(l*w + w*h + h*l);
        System.out.println("Cuboid ka surface area = "+sa);
    }
}
