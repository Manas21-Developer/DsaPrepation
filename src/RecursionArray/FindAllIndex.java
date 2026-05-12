package RecursionArray;
import java.util.*;
public class FindAllIndex {

    static ArrayList<Integer> helper (int [] arr, int target , int idx , ArrayList<Integer> list){
        if (idx == arr.length) return list;
        if (arr[idx] == target) list.add(idx);
        return helper(arr , target, idx+1 , list);
    }

    static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5};
        ArrayList<Integer>  ans = helper(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }
}
