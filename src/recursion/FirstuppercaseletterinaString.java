package recursion;
import java.util.*;
public class FirstuppercaseletterinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = check(s,0);
        System.out.println(c);
    }
    private static char check(String s, int i) {
        if (i >= s.length()) {
            return ' ';
        }
        if (Character.isUpperCase(s.charAt(i))) {
            return s.charAt(i);

        }
        return check(s, i + 1);
    }

}
