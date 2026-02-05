package recursion;
import java.util.*;
public class SumTriangleFromArray {
    private static void printTriangle(int[] arr) {
        if(arr.length<1){
            return;
        }
        int[] temp = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i] = arr[i]+arr[i+1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        printTriangle(array);
    }
}
