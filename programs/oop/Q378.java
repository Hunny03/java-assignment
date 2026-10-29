// Q378
package oop;
public class Q378 {
    static class BankAccount {
        private String accNo;
        private double balance;
        public String getAccNo(){ return accNo; }
        public void setAccNo(String a){ accNo = a; }
        public double getBalance(){ return balance; }
        public void setBalance(double b){
            if(b>=0) balance = b;
            else System.out.println("Balance negative nahi ho sakta");
        }
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccNo("PB-0093-7741");
        b.setBalance(15000);
        System.out.println(b.getAccNo()+" me "+b.getBalance()+" hai");
        b.setBalance(-50);
        System.out.println("Balance abhi bhi "+b.getBalance());
    }
}
