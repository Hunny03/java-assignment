// Q141
package basics;
import java.util.Scanner;
public class Q141 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Alphabet daalo: ");
        char c = kb.next().charAt(0);
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            System.out.println("Vowel hai");
        else if(c>='a' && c<='z')
            System.out.println("Consonant hai");
        else
            System.out.println("Ye alphabet nahi hai");
    }
}
