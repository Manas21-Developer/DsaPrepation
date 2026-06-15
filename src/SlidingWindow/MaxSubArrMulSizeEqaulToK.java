package SlidingWindow;

public class MaxSubArrMulSizeEqaulToK {
    public static int helper (int []arr , int k){
        if (arr == null || k<=0 || k> arr.length )return -1;

        int start = 0;
        int max = Integer.MIN_VALUE;
        int mul = 1;
        for (int end =0 ; end <arr.length;end++){
            mul *= arr[end];
            if (end-start+1 == k){
                max = Math.max(mul,max);
                mul /= arr[start];
                start++;
            }
        }return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3};
        int k = 2;

        System.out.println(helper(arr, k)); // 10
    }
}
