// Q261
package inheritance;
public class Q261 {
    static class Vehicle {
        void drive(){ System.out.println("Vehicle chal rahi hai"); }
    }
    static class Car extends Vehicle {
        void drive(){ System.out.println("Car repair ho rahi hai"); }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.drive();
        c.drive();
    }
}
