// Q023
package singlearrays;
import java.util.Arrays;
public class Q023 {
    public static void main(String[] args) {
        int a[] = {42,7,19,88,3,56};
        System.out.println("Pehle: "+Arrays.toString(a));
        // Arrays.sort se sort ho jata hai
        Arrays.sort(a);
        System.out.println("Sort ke baad: "+Arrays.toString(a));
        // descending ke liye ulta print
        System.out.print("Descending: ");
        for(int i=a.length-1;i>=0;i--) System.out.print(a[i]+" ");
        System.out.println();
    }
}
