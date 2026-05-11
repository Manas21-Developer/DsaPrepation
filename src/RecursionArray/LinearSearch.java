package RecursionArray;

public class LinearSearch {
    static int helper(int [] arr, int idx , int target){
        if (idx == arr.length) return -1;
        if (arr[idx] == target) return idx;
        return helper(arr, idx+1,target);
    }

    static void main(String [] args) {
        int [] arr = {1,2,3,6,8,9};
        int target = 9;
        System.out.println(helper(arr,0,target));
    }
}
