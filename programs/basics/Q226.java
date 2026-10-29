// Q226
package basics;
public class Q226 {
    // regular pentagon ka area = 1.72048 * side * side
    static double pentArea(double s){
        return 1.72048*s*s;
    }
    public static void main(String[] args) {
        System.out.println("Side 8 wale pentagon ka area = "+pentArea(8));
    }
}
