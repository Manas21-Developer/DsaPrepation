package BinarySearch.Answer;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while (low<= high){
            int mid  = low +(high-low)/2;
            int missing = arr[mid] -(mid+1);
            if (missing <k) low = mid+1;
            else high = mid-1;
        }return low+k; // logic bheind this line
        /*
        Actual Value - Expected Value = Missing Count

        arr[i] - (i + 1) = missing

        Answer = high + 1 + k
         */
    }
}
