package Array.OneDArray;

public class FindMaximusSumTriplet {
    static int helper (int [] arr,int n){
        int ans = 0 ;
        for (int i  = 0 ; i<n;i++){
            for (int j= i+1;j<n-1-i;j++){
                for (int k= j+1;k<n-2-j;j++){
                    if (arr[i]<arr[j] && arr[j]<arr[k] &&
                        ans < arr[i]+arr[j]+arr[k]){
                        ans = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }return ans;
    }

    static void main(String[] args) {
        int [] arr = {2 ,5 ,3 ,1 ,4 ,9};
        System.out.print(helper(arr,6));
    }
}
