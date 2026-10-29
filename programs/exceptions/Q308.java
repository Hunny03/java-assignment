// Q308
package exceptions;
public class Q308 {
    public static void main(String[] args) {
        try{
            System.out.println("Bahar wala try");
            try{
                int a[] = new int[2];
                a[5] = 10;      // yaha error
            }
            catch(ArithmeticException e){
                System.out.println("Andar wala catch (ye nahi chalega)");
            }
            finally{
                System.out.println("Andar wala finally hamesha chalta hai");
            }
        }
        catch(Exception e){
            System.out.println("Bahar wale catch ne pakda: "+e.getClass().getSimpleName());
        }
    }
}
