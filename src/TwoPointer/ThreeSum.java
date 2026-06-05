package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0 ; i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue; // remove duplicate
            int j = i+1; int k = n-1;
            while (j<k){
                int sum = nums[i] + nums[j] +nums[k];
                if ( sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++ ; k--;
                    while (j<k && nums[j] == nums[j-1]) j++; // rempve duplicate
                    while (j<k && nums[k] == nums[k+1]) k--; // remove duplicate
                }else if (sum <0) j++;
                else k--;
            }
        }return ans ;
    }

    static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
}
