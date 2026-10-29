// Q033
package functions;
public class Q033 {
    static int dogin(int n){
        int c = 0;
        while(n>0){
            if(n%10==2) c++;
            n = n/10;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("2202 me 2 ki ginti = "+dogin(2202));
        System.out.println("135 me 2 ki ginti = "+dogin(135));
        System.out.println("222222 me 2 ki ginti = "+dogin(222222));
    }
}
