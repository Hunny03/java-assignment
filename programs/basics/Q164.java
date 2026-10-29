// Q164
package basics;
import java.util.Scanner;
public class Q164 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("3 numbers: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if(a==b && b==c)
            System.out.println("Teeno barabar hai");
        else
            System.out.println("Teeno barabar nahi hai");
    }
}
