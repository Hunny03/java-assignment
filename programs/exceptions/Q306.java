// Q306
package exceptions;
import java.io.*;
public class Q306 {
    // throws likhne ka matlab: ye method exception de sakta hai, call karne wala sambhale
    static void file_kholo(boolean galat) throws IOException {
        if(galat)
            throw new IOException("settings.cfg khul nahi payi");
        System.out.println("Settings load ho gayi");
    }
    public static void main(String[] args) {
        try{
            file_kholo(false);
            file_kholo(true);
        }
        catch(IOException e){
            System.out.println("main me pakda: "+e.getMessage());
        }
    }
}
