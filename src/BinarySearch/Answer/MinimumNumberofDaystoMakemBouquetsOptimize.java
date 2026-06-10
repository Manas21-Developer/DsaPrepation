package BinarySearch.Answer;

public class MinimumNumberofDaystoMakemBouquetsOptimize {
    public int minDays(int[] bloomDay, int m, int k) {
        int start =  Integer.MAX_VALUE;
        for (int i : bloomDay){
            start= Math.min(i,start);
        }

        int end = Integer.MIN_VALUE;
        for (int i : bloomDay){
            end = Math.max(i,end);
        }

        int ans = -1;

        while (start <=end){
            int mid  = start +(end-start)/2;
            if (helper(bloomDay,mid,m,k) == true){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }return ans;
    }

    public boolean helper(int [] arr , int days , int m , int k){
        int cnt = 0;
        int bouquet = 0;

        for (int flower : arr){
            if (flower <= days) cnt ++;
            else {
                bouquet += cnt/k;
                cnt = 0;
            }
        }

        bouquet += cnt/k;
        return  bouquet >= m;
    }
}
