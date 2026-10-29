// Q077
package strings;
public class Q077 {
    public static void main(String[] args) {
        String s = "27-10-2026";
        String p[] = s.split("-");
        System.out.println("Din = "+p[0]);
        System.out.println("Mahina = "+p[1]);
        System.out.println("Saal = "+p[2]);
        System.out.println("Total parts = "+p.length);
    }
}
