// Q241
package interfaces;
public class Q241 {
    interface Flyable {
        void fly_obj();
    }
    static class Spacecraft implements Flyable {
        public void fly_obj(){ System.out.println("Spacecraft space me ud raha hai"); }
    }
    static class Airplane implements Flyable {
        public void fly_obj(){ System.out.println("Airplane hawa me ud raha hai"); }
    }
    static class Helicopter implements Flyable {
        public void fly_obj(){ System.out.println("Helicopter pankhe se ud raha hai"); }
    }
    public static void main(String[] args) {
        Flyable f[] = {new Spacecraft(), new Airplane(), new Helicopter()};
        for(int i=0;i<f.length;i++)
            f[i].fly_obj();
    }
}
