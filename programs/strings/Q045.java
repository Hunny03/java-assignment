// Q045
package strings;
import java.util.Arrays;
import java.util.Scanner;
public class Q045 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Pehla string: ");
        String s1 = kb.nextLine().replace(" ","").toLowerCase();
        System.out.print("Dusra string: ");
        String s2 = kb.nextLine().replace(" ","").toLowerCase();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            System.out.println("Anagram hai");
        else
            System.out.println("Anagram nahi hai");
    }
}
