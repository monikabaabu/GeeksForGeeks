package recursion;
import java.util.*;
public class Generateallbinarystringswithoutconsecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        string(n,"",list);
        System.out.println(list);
    }
    private static void string(int n , String s, List<String> list){
        if(s.length()==n){
            list.add(s);
            return;
        }
        string(n,s+"0",list);
        if(s.length()==0 || s.charAt(s.length()-1)!='1'){
            string(n,s+"1",list);
        }
    }

}
