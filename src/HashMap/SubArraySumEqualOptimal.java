package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualOptimal {
    static int helper (int [] arr , int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // veryImp
        int pSum = 0; int cnt = 0;
        for (int i : arr){
            pSum += i;
            if (map.containsKey(pSum-k)){
                cnt += map.get(pSum-k);
            }
            map.put(pSum , map.getOrDefault(pSum , 0)+1);
        }return  cnt;
    }

    static void main(String[] args) {
        int [] arr = {1,1,1};
        int ans = helper(arr,2);
        System.out.println(ans);
    }
}
