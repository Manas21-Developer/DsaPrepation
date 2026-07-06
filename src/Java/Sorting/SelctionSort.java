package Java.Sorting;

public class SelctionSort {
    void selectionSort(int[] arr) {
        for (int i = 0 ; i<arr.length;i++){
            int lastIdx = arr.length-1 -i;
            int maxIdx = helper(arr,lastIdx+1);
            swap (arr,lastIdx,maxIdx);
        }
    }
    public int helper(int [] arr , int len){
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0 ; i<len;i++){
            if (arr[i] >max){
                max = arr[i];
                idx = i;
            }
        }return idx;
    }

    public void swap (int [] arr , int i ,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]= temp;
    }
}
