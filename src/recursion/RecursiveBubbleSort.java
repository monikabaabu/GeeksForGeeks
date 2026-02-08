package recursion;
import java.util.*;
public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        check(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    private static void check(int[] arr, int n){
        if(n==1){
            return;
        }
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }

        }
        if(count==0){
            return;
        }
        check(arr,n-1);
    }

}
