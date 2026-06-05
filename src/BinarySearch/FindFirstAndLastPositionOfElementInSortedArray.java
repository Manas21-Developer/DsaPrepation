package BinarySearch;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int firstIdx = helper(nums,target,true);
        if(firstIdx != -1){
            int secondIdx = helper(nums,target,false);
            return new int []  {firstIdx,secondIdx};
        }else {
            return new int []  {firstIdx,-1};
        }
    }
    public static int helper (int [] arr , int target, boolean flag ){
        int s =  0  ; int e = arr.length-1;
        int ans = -1;
        while (s<=e){
            int mid = s +(e-s)/2;
            if (arr[mid] == target){
                if(flag){
                    ans = mid;
                    e= mid-1;
                }else {
                    ans = mid;
                    s= mid+1;
                }
            }
            else if(arr[mid] > target) e = mid-1;
            else s= mid+1;
        }return ans;
    }

    static void main(String[] args) {
        int [] arr ={5,7,7,8,8,10};
        int [] ans = searchRange(arr,8);
        for (int i : ans){
            System.out.print(i+" ");
        }
    }
}
