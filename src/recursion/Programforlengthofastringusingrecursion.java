package recursion;
import java.util.*;
public class Programforlengthofastringusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
    }
    private static int check(String s){
        if(s.equals("")){
            return 0;
        }
        return check(s.substring(1))+1;
    }

}
