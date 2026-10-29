// Q228
package basics;
import java.util.Scanner;
public class Q228 {
    static boolean palin(int n){
        int t = n, u = 0;
        while(t>0){
            u = u*10 + t%10;
            t = t/10;
        }
        return u==n;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        int n = kb.nextInt();
        if(palin(n))
            System.out.println("Palindrome hai");
        else
            System.out.println("Palindrome nahi hai");
    }
}
