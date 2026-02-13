package recursion;
import java.util.*;
public class Meanofarrayusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        int s=0;
        System.out.println(sum(arr,0,s)/n);
    }
    private static int sum(int[] arr , int i,int s){
        if(i==arr.length){
            return s;
        }
        return sum(arr,i+1,s+arr[i]);
    }
}
