// Q036
package functions;
public class Q036 {
    static boolean sabVowel(String s){
        if(s.length()==0) return false;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("aeiou -> "+sabVowel("aeiou"));
        System.out.println("AEIOUa -> "+sabVowel("AEIOUa"));
        System.out.println("vowel -> "+sabVowel("vowel"));
    }
}
