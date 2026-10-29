// Q273
package inheritance;
public class Q273 {
    static class Payment {
        void pay(double amt){ System.out.println(amt+" ka payment kisi bhi tarike se"); }
    }
    static class CardPayment extends Payment {
        void pay(double amt){ System.out.println(amt+" ka payment credit card se"); }
    }
    static class UpiPayment extends Payment {
        void pay(double amt){ System.out.println(amt+" ka payment UPI se"); }
    }
    public static void main(String[] args) {
        // reference same type ka hai par kaam object ke hisaab se hota hai
        Payment p = new Payment();
        p.pay(499);
        p = new CardPayment();
        p.pay(499);
        p = new UpiPayment();
        p.pay(499);
    }
}
