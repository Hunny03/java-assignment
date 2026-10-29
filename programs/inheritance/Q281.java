// Q281
package inheritance;
public class Q281 {
    static abstract class Person {
        abstract void eat();
        abstract void exercise();
    }
    static class Athlete extends Person {
        void eat(){ System.out.println("Athlete protein wala healthy khana khata hai"); }
        void exercise(){ System.out.println("Athlete roz ghanto practice karta hai"); }
    }
    static class LazyPerson extends Person {
        void eat(){ System.out.println("LazyPerson sofa par baith ke chips khata hai"); }
        void exercise(){ System.out.println("LazyPerson sirf fridge tak chalta hai"); }
    }
    public static void main(String[] args) {
        Person p[] = {new Athlete(), new LazyPerson()};
        for(int i=0;i<p.length;i++){
            p[i].eat();
            p[i].exercise();
        }
    }
}
