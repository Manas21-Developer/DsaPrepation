package Array.OneDArray;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int remaining = target - nums[i];

            // check if remaining element already exists
            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            }

            // store current element with index
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    // Main Method
    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = obj.twoSum(nums, target);

        System.out.println("Indexes are: " + ans[0] + " " + ans[1]);
    }
}