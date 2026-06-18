package SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0 ;
        int maxZero = 0;
        int maxLen = 0;
        while (right < nums.length){
            if (nums[right] == 0 ) maxZero++;
            if (maxZero >k){
                if (nums[left] == 0) maxZero--;
                left++;
            }
            if (maxZero<=k){
                int len =  right - left+1;
                maxLen  = Math.max(len,maxLen);
            }
            right++;
        }return maxLen;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println("Max length of consecutive one in the arr :- "+ longestOnes(arr,2));
    }
}
