package BinarySearch.Answer;

public class MinimumNumberofDaystoMakemBouquetsBruteForce {
    public static int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        for (int i : bloomDay){
            min = Math.min(min,i);
        }

        int max = Integer.MIN_VALUE;
        for (int i :bloomDay){
            max= Math.max(max,i);
        }

        for (int i = min; i<=max; i++){
            if (helper(bloomDay,i,m,k) == true){
                return i;
            }
        } return -1;
    }
    public static boolean helper (int [] arr , int days , int m , int k){
        if (arr.length < m*k) return false;
        int cnt = 0;
        int bouquets = 0;

        for (int flower  :  arr){
            if (flower <= days) cnt++;
            else {
                bouquets += cnt/k;
                cnt  = 0;
            }
        }
        bouquets += cnt/k;
        return bouquets >=m;
    }

    public static void main(String[] args) {
        int [] bloomsDay ={1,10,3,10,2};
        System.out.println(minDays(bloomsDay,3,1)); // ans =3;
    }
}
