// Q050
package strings;
import java.util.Scanner;
public class Q050 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                c++;
        }
        System.out.println("Total characters (space ke bina) = "+c);
        System.out.println("Total characters (space ke saath) = "+s.length());
    }
}
