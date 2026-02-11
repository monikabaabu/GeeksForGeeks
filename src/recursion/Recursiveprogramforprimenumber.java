package recursion;
import java.util.*;
public class Recursiveprogramforprimenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n,2));
    }
    private static boolean prime( int n, int i){
        if( n<=2){
            if(n==2){
                return true;
            }
            else{
                return false;
            }
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return prime(n,i+1);
    }

}
