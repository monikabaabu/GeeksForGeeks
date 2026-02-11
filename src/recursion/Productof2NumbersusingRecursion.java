package recursion;
import java.util.*;
public class Productof2NumbersusingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(multiply(x,y));
    }
    private static int multiply(int x, int y){
        if(x==0){
            return 0;
        }
        if(x < 0){
            return -multiply(-x, y);
        }
        return multiply(x-1,y)+y;
    }

}
