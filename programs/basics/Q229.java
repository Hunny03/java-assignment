// Q229
package basics;
public class Q229 {
    static void primeDikha(int a, int b){
        for(int n=a;n<=b;n++){
            int flag = 1;
            if(n<2) flag = 0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0) flag = 0;
            }
            if(flag==1)
                System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("1 se 20 ke beech prime numbers:");
        primeDikha(1,20);
    }
}
