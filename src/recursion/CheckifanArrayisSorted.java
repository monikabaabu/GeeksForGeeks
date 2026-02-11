package recursion;
import java.util.*;
public class CheckifanArrayisSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr,1));
    }
    private static boolean check(int[] arr,int i){
        if(i== arr.length){
            return true;
        }
        if(arr[i]<arr[i-1]){
            return false;
        }
        return check(arr, i+1);
    }
}
