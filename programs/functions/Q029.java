// Q029
package functions;
public class Q029 {
    static void dikha(char a, char b){
        for(char c=a;c<=b;c++)
            System.out.print(c+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        dikha('A','P');
    }
}
