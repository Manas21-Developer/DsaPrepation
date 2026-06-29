package SlidingWindow;

public class MaximumAverageSubarrayI {
    public  static double findMaxAverage(int[] nums, int k) {
        int start = 0 ;
        int end = 0;

        long sum = 0;
        long maxSum =  Long.MIN_VALUE;

        while (end < nums.length){
            sum += nums[end];
            if (end - start +1 == k){
                maxSum = Math.max(sum,maxSum);
                sum -= nums[start];
                start++;
            }
            end++;
        } return (double)maxSum/k;
    }

    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        System.out.println("Max average :- "+ findMaxAverage(arr ,4));
    }
}
