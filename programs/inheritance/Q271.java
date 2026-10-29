// Q271
package inheritance;
public class Q271 {
    static class Printer {
        void printLine(){ System.out.println("Printer: normal line print ho rahi hai"); }
    }
    static class ColorPrinter extends Printer {
        void printLine(){
            super.printLine();      // pehle parent wala kaam
            System.out.println("ColorPrinter: ab colour bhi daal diya");
        }
    }
    public static void main(String[] args) {
        ColorPrinter c = new ColorPrinter();
        c.printLine();
    }
}
