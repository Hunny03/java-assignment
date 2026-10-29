// Q109
package basics;
import java.util.Scanner;
public class Q109 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number daalo: ");
        int n = kb.nextInt();
        int s = 0;
        while(n!=0){
            s = s + n%10;
            n = n/10;
        }
        System.out.println("Digits ka sum = "+s);
    }
}
