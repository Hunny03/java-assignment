// Q177
package basics;
import java.util.Scanner;
public class Q177 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        System.out.print("Kaun sa character hatana hai: ");
        char c = kb.next().charAt(0);
        String n = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c)
                n = n + s.charAt(i);
        }
        System.out.println("Naya string = "+n);
    }
}
