// Q054
package strings;
public class Q054 {
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "CDAB";
        // a ko do baar jodo, agar b usme mil gaya to rotation hai
        if(a.length()==b.length() && (a+a).contains(b))
            System.out.println(b+" ye "+a+" ka rotation hai");
        else
            System.out.println("Rotation nahi hai");
    }
}
