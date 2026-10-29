// Q145
package basics;
import java.util.Scanner;
public class Q145 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("CGPA daalo (10 me se): ");
        double cg = kb.nextDouble();
        double per = cg*9.5;     // percentage = CGPA x 9.5
        System.out.println("Percentage = "+per+"%");
    }
}
