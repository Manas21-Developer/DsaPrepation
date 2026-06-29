package SlidingWindow;

public class MaximumConsectiveOneEasy {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int cnt  =0;
        int ans =0 ;
        while (end < nums.length){
            if (nums[end] == 1)cnt ++;
            else {
                ans = Math.max(cnt,ans);
                cnt = 0;
                start=end;
            }
            end++;
        }
        return Math.max(ans,cnt);
    }

    static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        System.out.println("Maximum consecutive one are :- "+findMaxConsecutiveOnes(arr));
    }
}
