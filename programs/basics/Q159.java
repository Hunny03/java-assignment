// Q159
package basics;
import java.util.Scanner;
public class Q159 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Kahan tak? ");
        int n = kb.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println("Cube of "+i+" = "+(i*i*i));
    }
}
