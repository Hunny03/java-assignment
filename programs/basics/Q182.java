// Q182
package basics;
import java.util.Scanner;
public class Q182 {
    public static void main(String[] args) {
        int a[] = {14,27,39,8,51,62};
        Scanner kb = new Scanner(System.in);
        System.out.print("Kya dhundhna hai: ");
        int x = kb.nextInt();
        int pos = -1;
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                pos = i;
                break;
            }
        }
        if(pos==-1)
            System.out.println("Nahi mila");
        else
            System.out.println(x+" index "+pos+" par hai");
    }
}
