// Q147
package basics;
import java.util.Scanner;
public class Q147 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Total runs aur kitni baar out hua: ");
        int runs = kb.nextInt();
        int out = kb.nextInt();
        if(out==0)
            System.out.println("Out hi nahi hua, average nahi nikalega");
        else{
            double avg = (double)runs/out;
            System.out.println("Batting average = "+avg);
        }
    }
}
