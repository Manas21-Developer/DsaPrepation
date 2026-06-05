package BinarySearch;

public class FindPeakEle {
    public static int findPeakElement(int[] nums) {
        int s = 0 ;
        int e = nums.length-1;
        while(s<=e){
            if (s==e) return s;
            int mid = s+(e-s)/2;
            if(nums[mid] <nums[mid+1]) s=mid+1;
            else e = mid;
        }return -1;
    }

    static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
        System.out.print(findPeakElement(arr));
    }
}
