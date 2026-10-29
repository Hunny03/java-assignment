// Q234
package basics;
public class Q234 {
    static void check(double x){
        if(x==(int)x)
            System.out.println(x+" integer hai");
        else
            System.out.println(x+" integer nahi hai");
    }
    public static void main(String[] args) {
        check(25.0);
        check(25.75);
        check(-8.0);
    }
}
