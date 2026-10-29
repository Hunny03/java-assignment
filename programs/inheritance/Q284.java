// Q284
package inheritance;
public class Q284 {
    static abstract class Bird {
        abstract void fly();
        abstract void makeSound();
    }
    static class Eagle extends Bird {
        void fly(){ System.out.println("Eagle pahado ke upar udta hai"); }
        void makeSound(){ System.out.println("Eagle: kee-kee-kee"); }
    }
    static class Hawk extends Bird {
        void fly(){ System.out.println("Hawk khet ke upar neeche udta hai"); }
        void makeSound(){ System.out.println("Hawk: kree-eee-ar"); }
    }
    public static void main(String[] args) {
        Bird b[] = {new Eagle(), new Hawk()};
        for(int i=0;i<b.length;i++){
            b[i].fly();
            b[i].makeSound();
        }
    }
}
