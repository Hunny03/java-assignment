// Q220
package basics;
public class Q220 {
    static int chhota(int a, int b, int c){
        int m = a;
        if(b<m) m = b;
        if(c<m) m = c;
        return m;
    }
    public static void main(String[] args) {
        System.out.println("48, 19, 33 me sabse chhota = "+chhota(48,19,33));
    }
}
