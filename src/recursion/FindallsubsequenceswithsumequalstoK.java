package recursion;
import java.util.*;
public class FindallsubsequenceswithsumequalstoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        sequence(list,new ArrayList<>(),arr,0,t);
        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
    private static void sequence(List<List<Integer>> list, List<Integer> l, int[] arr, int i, int t){
        if (i == arr.length) {
            if (t == 0) {
                list.add(new ArrayList<>(l));
            }
            return;
        }
        l.add(arr[i]);
        sequence(list,l,arr,i+1,t-arr[i]);
        l.remove(l.size()-1);
        sequence(list,l,arr,i+1,t);
    }
}
