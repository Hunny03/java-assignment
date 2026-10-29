// Q055
package strings;
import java.util.Scanner;
public class Q055 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String: ");
        String s = kb.nextLine();
        System.out.print("N (kitne parts): ");
        int n = kb.nextInt();
        if(s.length()%n!=0){
            System.out.println("Equal parts nahi ho sakte");
        }
        else{
            int size = s.length()/n;
            for(int i=0;i<n;i++){
                System.out.println("Part "+(i+1)+" = "+s.substring(i*size,(i+1)*size));
            }
        }
    }
}
