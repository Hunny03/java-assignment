// Q272
package inheritance;
public class Q272 {
    static class Bird {
        void fly(){ System.out.println("Zyada tar birds ud sakti hai"); }
    }
    static class Penguin extends Bird {
        void fly(){ System.out.println("Penguin ud nahi sakta, tairta hai"); }
    }
    static class Eagle extends Bird {
        void fly(){ System.out.println("Eagle bahut oonchai par udta hai"); }
    }
    public static void main(String[] args) {
        Bird b = new Bird();
        Bird p = new Penguin();
        Bird e = new Eagle();
        b.fly();
        p.fly();
        e.fly();
    }
}
