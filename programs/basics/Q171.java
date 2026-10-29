// Q171
package basics;
import java.util.Scanner;
public class Q171 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Spaces wali string: ");
        String s = kb.nextLine();
        System.out.println("Pehle: ["+s+"]");
        System.out.println("Baad me: ["+s.trim()+"]");
    }
}
