package recursion;
import java.util.*;
public class Removeallconsecutiveduplicatesfromastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        remove(s,sb,0);
        System.out.println(sb.toString());
    }
    private static void remove( String s , StringBuilder sb,int i ){
        if(i==s.length()){
            return;
        }
        if(s.charAt(i)==sb.charAt(sb.length()-1)){
            remove(s,sb,i+1);
        }
        sb.append(s.charAt(i));
        remove(s,sb,i+1);
    }
}
