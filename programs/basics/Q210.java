// Q210
package basics;
import java.util.Scanner;
public class Q210 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Kitne integers daaloge: ");
        int n = kb.nextInt();
        int es = 0, os = 0;
        System.out.print("Ab numbers daalo: ");
        for(int i=0;i<n;i++){
            int x = kb.nextInt();
            if(x%2==0) es += x;
            else os += x;
        }
        System.out.println("Even ka sum = "+es);
        System.out.println("Odd ka sum = "+os);
    }
}
