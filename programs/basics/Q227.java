// Q227
package basics;
import java.util.Scanner;
public class Q227 {
    static boolean evenHai(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Number: ");
        int n = kb.nextInt();
        if(evenHai(n))
            System.out.println(n+" even hai");
        else
            System.out.println(n+" odd hai");
    }
}
