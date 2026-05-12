package BinarySearch;

public class RotatedBinarySearch {
    static  int helper(int [] arr , int target , int s , int e){
        if (s >e) return -1;
        int m = s + (e-s)/2;
       if (arr[m] == target) return m;

       if (arr[s] <= arr[m]){
           if (target >= arr[s] && target <= arr[m]) return helper(arr,target,s,m-1);
           else return helper(arr,target,m+1,e);
       }

       if(target  >=arr[m] && target<=arr[e]) return helper(arr,target,m+1,e);
       else return helper(arr, target,s,m-1);
    }

    static void main(String[] args) {
        int [] arr = {5,6,7,8,1,2,3,4};
        int [] arr2 = {5,6,1,2,3,4};
        int n = arr.length-1; int n2 = arr2.length-1;
        //System.out.println(helper(arr,7,0,n));
        System.out.println(helper(arr2,6,0,n2));
    }
}
