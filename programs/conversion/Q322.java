// Q322
package conversion;
public class Q322 {
    public static void main(String[] args) {
        String s = "2026";
        int n = Integer.parseInt(s);
        System.out.println("String se int: "+n);
        System.out.println("n + 1 = "+(n+1));
        int m = Integer.valueOf("150");
        System.out.println("valueOf se: "+m);
    }
}
