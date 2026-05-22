package RecursiveSort;


import java.util.Arrays;

public class MergeSort {
    public static void helper(int [] arr , int start , int end ){
        if (start >= end) return ;
        int mid = start +(end-start)/2;

        helper(arr,start,mid);
        helper(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid-start+1;
        int n2 = end-mid;

        int [] left = new int[n1];
        int [] right = new int[n2];

        for(int i = 0 ;i<n1;i++){
            left[i] = arr[start+i];
        }

        for (int j =0 ; j<n2;j++){
            right[j] = arr[mid+1+j];
        }

        int i = 0 , j = 0 , k = start ;
        while (i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] =  left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i<n1){
            arr[k++] = left[i++];
        }

        while (j<n2){
            arr[k++] = right[j++];
        }
    }

   public static void main(String[] args) {

       int[] arr = {5,4,2,1};

       System.out.println("Before Sorting:");
       System.out.println(Arrays.toString(arr));

       helper(arr, 0, arr.length - 1);

       System.out.println("After Sorting:");
       System.out.println(Arrays.toString(arr));
    }
}
