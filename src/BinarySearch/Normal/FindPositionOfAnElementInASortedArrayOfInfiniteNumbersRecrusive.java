package BinarySearch.Normal;

public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbersRecrusive {
    public static int helper(int [] arr,int target){
        return findRange(arr,target , 0 ,1);
    }

    public  static int findRange(int [] arr , int target , int start , int end){
        if (target <= arr[end]) return bs(arr,target,start,end);
        return findRange(arr,target,end+1,end*2);
    }

    public static int bs(int [] arr, int target , int start , int end ){
        if (start >end) return -1;

        int mid = start +(end-start)/2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] >target) return bs(arr,target,start,mid-1);
        else return bs(arr,target,mid+1,end);
    }

    public static void main(String[] args) {

        int[] arr = {
                2, 4, 6, 8, 10,
                12, 14, 16, 18, 20,
                22, 24, 26, 28, 30,
                32, 34, 36, 38, 40
        };

        System.out.println(helper(arr, 6));
    }
}
