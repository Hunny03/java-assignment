// Q057
package strings;
public class Q057 {
    static void banao(String pehle, String baaki){
        if(baaki.length()==0){
            System.out.print(pehle+" ");
            return;
        }
        for(int i=0;i<baaki.length();i++){
            banao(pehle+baaki.charAt(i), baaki.substring(0,i)+baaki.substring(i+1));
        }
    }
    public static void main(String[] args) {
        System.out.println("ABC ke permutations:");
        banao("","ABC");
        System.out.println();
    }
}
