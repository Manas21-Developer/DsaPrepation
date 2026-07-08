package Java.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int pSum = 0 ;
        int cnt = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i : nums){
            pSum += i;
            if (map.containsKey(pSum-k)){
                cnt += map.get(pSum-k);
            }
            map.put(pSum ,map.getOrDefault(pSum,0)+1);
        }return cnt;
    }
}
