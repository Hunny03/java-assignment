// Q132
package basics;
import java.util.Scanner;
public class Q132 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // rectangle base wala prism lete hai
        System.out.print("Base ki length, width aur prism ki height: ");
        double l = kb.nextDouble();
        double w = kb.nextDouble();
        double h = kb.nextDouble();
        double vol = l*w*h;
        double sa = 2*(l*w) + 2*(l+w)*h;
        System.out.println("Prism ka volume = "+vol);
        System.out.println("Prism ka surface area = "+sa);
    }
}
