// Q280
package inheritance;
public class Q280 {
    static abstract class Vehicle {
        abstract void startEngine();
        abstract void stopEngine();
    }
    static class Car extends Vehicle {
        void startEngine(){ System.out.println("Car: button dabao, engine on"); }
        void stopEngine(){ System.out.println("Car: button dubara dabao, engine off"); }
    }
    static class Motorcycle extends Vehicle {
        void startEngine(){ System.out.println("Motorcycle: kick maaro, engine on"); }
        void stopEngine(){ System.out.println("Motorcycle: chaabi band karo, engine off"); }
    }
    public static void main(String[] args) {
        Vehicle v[] = {new Car(), new Motorcycle()};
        for(int i=0;i<v.length;i++){
            v[i].startEngine();
            v[i].stopEngine();
        }
    }
}
