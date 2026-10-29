// Q297
package exceptions;
public class Q297 {
    static void checkEven(int n) throws Exception {
        if(n%2!=0)
            throw new Exception(n+" odd hai");
        System.out.println(n+" even hai, theek hai");
    }
    public static void main(String[] args) {
        int a[] = {8,15,22};
        for(int i=0;i<a.length;i++){
            try{
                checkEven(a[i]);
            }
            catch(Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        }
    }
}
