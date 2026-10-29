// Q224
package basics;
import java.util.Scanner;
public class Q224 {
    static boolean leap(int y){
        if((y%4==0 && y%100!=0) || y%400==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Year: ");
        int y = kb.nextInt();
        if(leap(y))
            System.out.println("Leap year hai");
        else
            System.out.println("Leap year nahi hai");
    }
}
