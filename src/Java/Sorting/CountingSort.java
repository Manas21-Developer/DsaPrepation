package Java.Sorting;

public class CountingSort {
    public void helper(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            max = Math.max(i,max);
        }

        int [] freq = new int [max+1];
        for (int i = 0 ; i<arr.length;i++){
            int ele = arr[i];
            freq[ele]++;
        }

        for (int  i  = 1; i<freq.length;i++){
            freq[i]= freq[i] + freq[i-1];
        }

        int [] ans = new int [arr.length];
        for (int i = 0 ; i <ans.length;i++){

        }
    }

}
