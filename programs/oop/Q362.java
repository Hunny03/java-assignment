// Q362
package oop;
import java.util.ArrayList;
public class Q362 {
    static class Library {
        ArrayList<String> books = new ArrayList<String>();
        void addBook(String b){
            books.add(b);
            System.out.println("Add hui: "+b);
        }
        void removeBook(String b){
            if(books.remove(b))
                System.out.println("Hata di: "+b);
            else
                System.out.println("Nahi mili: "+b);
        }
        void show(){ System.out.println("Library me "+books.size()+" books: "+books); }
    }
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("Wings of Fire");
        l.addBook("The Alchemist");
        l.addBook("Godaan");
        l.show();
        l.removeBook("The Alchemist");
        l.removeBook("Ramayana");
        l.show();
    }
}
