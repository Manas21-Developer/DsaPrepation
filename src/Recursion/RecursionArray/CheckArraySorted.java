package Recursion.RecursionArray;

public class CheckArraySorted {
    static boolean helper (int [] arr , int idx){
        if (idx == arr.length-1) return true;
        return arr[idx] < arr[idx+1] && helper(arr,idx+1);
    }

    static void main(String[] args) {
        int [] arr = {1,2,3,4,70,10,13};
        System.out.println(helper(arr,0));
    }
}
