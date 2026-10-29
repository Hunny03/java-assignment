// Q260
package inheritance;
public class Q260 {
    static class Animal {
        void makeSound(){ System.out.println("Animal koi awaaz karta hai"); }
    }
    static class Cat extends Animal {
        void makeSound(){ System.out.println("Cat bark kar rahi hai (question me yahi likha hai)"); }
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        a.makeSound();
        c.makeSound();
    }
}
