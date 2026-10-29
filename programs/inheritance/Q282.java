// Q282
package inheritance;
public class Q282 {
    static abstract class Instrument {
        abstract void play();
        abstract void tune();
    }
    static class Glockenspiel extends Instrument {
        void play(){ System.out.println("Glockenspiel: metal ki patti par mallet maarte hai"); }
        void tune(){ System.out.println("Glockenspiel: patti ko ghis kar tune karte hai"); }
    }
    static class Violin extends Instrument {
        void play(){ System.out.println("Violin: bow ko taar par ghumate hai"); }
        void tune(){ System.out.println("Violin: peg ghuma kar tune karte hai"); }
    }
    public static void main(String[] args) {
        Instrument i[] = {new Glockenspiel(), new Violin()};
        for(int k=0;k<i.length;k++){
            i[k].tune();
            i[k].play();
        }
    }
}
