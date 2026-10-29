// Q080
package strings;
import java.util.Scanner;
public class Q080 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Pehla string: ");
        String a = kb.nextLine();
        System.out.print("Dusra string: ");
        String b = kb.nextLine();
        if(a.contains(b))
            System.out.println("Haan, pehle me dusra hai");
        else
            System.out.println("Nahi hai");
    }
}
