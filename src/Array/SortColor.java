package Array;

public class SortColor {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid<=high){
            //mid == 0
            if (nums[mid] == 0){
                swap(nums,low,mid);
                low++;mid++;
            }
            // mid ==1
            else if (nums[mid] == 1){
                mid++;
            }
            // mid == 2
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    static void swap(int [] arr, int i , int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }

    static void main(String[] args) {
        int [] arr = {2,0,1};
        System.out.print("Before sorting element look like ");
        for (int i : arr){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println();
        sortColors(arr);
        System.out.print("After sorting element look like ");
        for (int i : arr){
            System.out.print(+i+" ");
        }
    }
}
