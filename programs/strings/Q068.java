// Q068
package strings;
public class Q068 {
    public static void main(String[] args) {
        String a = "I love programming";
        String b = "Java ";
        int pos = 7;
        String n = a.substring(0,pos) + b + a.substring(pos);
        System.out.println("Pehle: "+a);
        System.out.println("Baad me: "+n);
    }
}
