// Q376
package oop;
public class Q376 {
    public static void main(String[] args) {
        // chalane ka tareeka:  java oop.Q376 red green blue
        if(args.length==0){
            System.out.println("Koi command line argument nahi diya");
            System.out.println("Aise chalao: java oop.Q376 red green blue");
        }
        else{
            System.out.println("Arguments = "+args.length);
            for(int i=0;i<args.length;i++)
                System.out.println("args["+i+"] = "+args[i]);
        }
    }
}
