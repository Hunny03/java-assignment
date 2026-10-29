// Q246
package interfaces;
public class Q246 {
    interface Playable {
        void play();
    }
    static class Football implements Playable {
        public void play(){ System.out.println("Football: 11 players ball ko kick karte hai"); }
    }
    static class Volleyball implements Playable {
        public void play(){ System.out.println("Volleyball: net ke upar se ball maarte hai"); }
    }
    static class Basketball implements Playable {
        public void play(){ System.out.println("Basketball: ball ko basket me daalte hai"); }
    }
    public static void main(String[] args) {
        Playable p[] = {new Football(), new Volleyball(), new Basketball()};
        for(int i=0;i<p.length;i++)
            p[i].play();
    }
}
