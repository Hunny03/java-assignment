// Q039
package strings;
public class Q039 {
    public static void main(String[] args) {
        String s = "Java";
        String s2 = s;
        s.concat(" Rocks");      // ye s ko change nahi karta
        System.out.println("s = "+s);
        s = s.concat(" Rocks");  // naya object bana aur s ab usko point karta hai
        System.out.println("s = "+s);
        System.out.println("purana s2 = "+s2);
        System.out.println("Purana String same raha, matlab String immutable hai");
    }
}
