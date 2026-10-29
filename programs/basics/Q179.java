// Q179
package basics;
import java.util.Scanner;
public class Q179 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("HTML wala string: ");
        String s = kb.nextLine();
        // < se > ke beech ka sab hata do
        String n = s.replaceAll("<[^>]*>","");
        System.out.println("Tags ke bina = "+n);
    }
}
