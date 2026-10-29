// Q110
package basics;
import java.util.Scanner;
public class Q110 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        if(a>b)
            System.out.println(a+" bada hai "+b+" se");
        else if(a<b)
            System.out.println(a+" chhota hai "+b+" se");
        else
            System.out.println("Dono barabar hai");
    }
}
