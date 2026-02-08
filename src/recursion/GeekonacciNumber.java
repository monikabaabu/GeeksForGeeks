import java.util.*;
public class GeekonacciNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(fib(a,b,c,n));
        }

    }
    private static int fib(int a, int b, int c, int n){
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        if(n==3){
            return c;
        }
        return fib(a,b,c,n-1)+ fib(a,b,c,n-2)+ fib(a,b,c,n-3);
    }
}