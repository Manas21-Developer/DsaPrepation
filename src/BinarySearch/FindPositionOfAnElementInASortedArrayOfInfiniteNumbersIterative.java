package BinarySearch;

public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbersIterative {
    public static int helper(int [] arr , int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            start = end;
            end = end *2;
        }

        // bs
        while (start <= end) {
            int mid = start +(end -start)/2;
            if (arr[mid] == target) return  mid;
            else if(arr[mid] >target) end = mid-1;
            else start = mid+1;
        }return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
                2, 4, 6, 8, 10,
                12, 14, 16, 18, 20,
                22, 24, 26, 28, 30,
                32, 34, 36, 38, 40
        };

        int target = 26;

        int ans = helper(arr, target);

        System.out.println("Index = " + ans);
    }
}
