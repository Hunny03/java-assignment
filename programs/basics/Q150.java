// Q150
package basics;
import java.util.Scanner;
public class Q150 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Base aur power: ");
        double b = kb.nextDouble();
        int p = kb.nextInt();
        double ans = 1;
        for(int i=1;i<=p;i++)
            ans = ans*b;
        System.out.println(b+" ki power "+p+" = "+ans);
    }
}
