// Q223
package basics;
public class Q223 {
    static int digSum(int n){
        int s = 0;
        while(n>0){
            s += n%10;
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("90817 ke digits ka sum = "+digSum(90817));
    }
}
