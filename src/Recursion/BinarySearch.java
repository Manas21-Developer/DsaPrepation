package Recursion;

public class BinarySearch {
    static int BS (int [] arr , int target , int s , int e){
        if (s >e) return -1;
        int m = s + (e-s)/2;
        if (arr[m] == target)  return  m;
        else if (arr[m] >target) return BS(arr, target,s, m-1);
        else return BS(arr,target,m+1,e);
    }

    static void main(String args []){
        int [] arr =  {1,2,4,55,66,78,99};
        int target = 9;
        System.out.println(BS(arr ,target,0,arr.length));
    }
}
