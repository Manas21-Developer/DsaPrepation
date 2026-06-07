package BinarySearch;

public class SearchInRotatedSortedArrayDuplicate {
    public static boolean search(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length-1;
        while (start <=  end){
            int mid  = start+(end-start)/2;
            if (arr[mid] == target) return true;

            // remove duplicate
            if (arr[start] == arr[mid] &&
                    arr[mid] == arr[end]){
                start++;
                end--;
                continue;
            }

            //left sorted
            if(arr[start] <= arr[mid]){
                if (arr[start] <= target &&
                        target <= arr[mid]){
                    end = mid-1;
                }else start = mid +1;
            }
            // right sorted
            else {
                if (arr[mid] <= target &&
                        target <= arr[end]){
                    start = mid+1;
                }
                else end = mid-1;
            }
        } return false;
    }

    static void main(String[] args) {
        int [] arr =  {2,5,6,0,0,1,2};
        System.out.println(search(arr,3));
    }
}
