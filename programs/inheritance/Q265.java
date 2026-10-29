// Q265
package inheritance;
public class Q265 {
    static class Animal {
        void move(){ System.out.println("Animal chalta hai"); }
    }
    static class Cheetah extends Animal {
        void move(){ System.out.println("Cheetah 100 km/h se bhagta hai"); }
    }
    public static void main(String[] args) {
        Animal a = new Cheetah();      // parent ka reference, child ka object
        a.move();
    }
}
