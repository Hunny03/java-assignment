// Q277
package inheritance;
public class Q277 {
    static abstract class Animal {
        abstract void eat();
        abstract void sleep();
    }
    static class Lion extends Animal {
        void eat(){ System.out.println("Lion shikar karke maas khata hai"); }
        void sleep(){ System.out.println("Lion din me 20 ghante sota hai"); }
    }
    static class Tiger extends Animal {
        void eat(){ System.out.println("Tiger hiran khata hai"); }
        void sleep(){ System.out.println("Tiger chhaon me aaram karta hai"); }
    }
    static class Deer extends Animal {
        void eat(){ System.out.println("Deer ghaas khata hai"); }
        void sleep(){ System.out.println("Deer thodi der sota hai, hamesha alert"); }
    }
    public static void main(String[] args) {
        Animal a[] = {new Lion(), new Tiger(), new Deer()};
        for(int i=0;i<a.length;i++){
            a[i].eat();
            a[i].sleep();
        }
    }
}
