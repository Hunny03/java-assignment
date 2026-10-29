// Q320
package threads;
public class Q320 {
    static class Dabba {
        String msg;
        boolean bhara = false;
        synchronized void daalo(String m) throws Exception {
            while(bhara) wait();          // jab tak dabba khali na ho ruko
            msg = m;
            bhara = true;
            System.out.println("Daala: "+m);
            notify();
        }
        synchronized void nikalo() throws Exception {
            while(!bhara) wait();         // jab tak kuch aaye nahi ruko
            System.out.println("Nikala: "+msg);
            bhara = false;
            notify();
        }
    }
    static class Likhne extends Thread {
        Dabba d;
        Likhne(Dabba d){ this.d = d; }
        public void run(){
            try{
                for(int i=1;i<=3;i++){
                    d.daalo("letter-"+i);
                    Thread.sleep(100);
                }
            }catch(Exception e){}
        }
    }
    static class Padhne extends Thread {
        Dabba d;
        Padhne(Dabba d){ this.d = d; }
        public void run(){
            try{
                for(int i=1;i<=3;i++)
                    d.nikalo();
            }catch(Exception e){}
        }
    }
    public static void main(String[] args) throws Exception {
        Dabba d = new Dabba();
        Likhne w = new Likhne(d);
        Padhne r = new Padhne(d);
        r.start();
        w.start();
        w.join();
        r.join();
        // suspend/resume purane ho gaye hai, unki jagah wait/notify use hota hai
    }
}
