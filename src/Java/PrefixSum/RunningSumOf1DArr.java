package PrefixSum;

public class RunningSumOf1DArr {
    public int[]  helper (int [] arr){
        for (int  i =1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }return arr;
    }
}
