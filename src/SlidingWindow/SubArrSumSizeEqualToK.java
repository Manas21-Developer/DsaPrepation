package SlidingWindow;

public class SubArrSumSizeEqualToK {
    public static int maxSubarraySum(int[] arr, int k) {
        int start = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int end = 0; end<arr.length;end++){
            sum+= arr[end];

            if (end-start+1 == k){
                max = Math.max(max,sum);
                sum -= arr[start];
                start++;
            }
        }return max;
    }

    public static void main(String[] args) {
            int[] arr = {2, 5, 1, 8, 2, 9, 1};
            int k = 3;

            System.out.println("Maximum Sum Subarray of Size " + k + " = "
                    + maxSubarraySum(arr, k));
    }

}
