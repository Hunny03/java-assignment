// Q204
package basics;
import java.util.Scanner;
public class Q204 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Student ka naam: ");
        String name = kb.nextLine();
        System.out.print("Kitne subjects: ");
        int n = kb.nextInt();
        int tot = 0;
        for(int i=1;i<=n;i++){
            System.out.print("Subject "+i+" marks (100 me se): ");
            tot = tot + kb.nextInt();
        }
        double per = tot*100.0/(n*100);
        System.out.println("Naam = "+name);
        System.out.println("Total marks = "+tot+" / "+(n*100));
        System.out.println("Percentage = "+per+"%");
    }
}
