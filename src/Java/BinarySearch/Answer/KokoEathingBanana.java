package BinarySearch.Answer;

public class KokoEathingBanana {
    public  int solution(int [] arr , int h){
        return helper(arr, h);
    }

    private int helper(int[] arr, int target) {
        int start = 1;
        int end =Integer.MIN_VALUE;
        int ans  = -1;
        for (int i : arr){
            end = Math.max(end,i);
        }
        while (start <= end){
            int mid = start +(end-start)/2;
            long totalHour = findTotalHour(arr,mid);
            if(totalHour <= target){
                ans = mid;
                end = mid-1;
            }else start = mid+1;
        }return ans;
    }

    private long findTotalHour(int[] arr, int givenTime ) {
        long hourTaken = 0;
        for (int i : arr){
            hourTaken += (i+(long)givenTime -1)/givenTime;
        }return hourTaken;
    }

    public static void main(String[] args) {
        int [] arr = {3,6,7,11};
        KokoEathingBanana obj = new KokoEathingBanana();
        int ans = obj.solution(arr, 8);
        System.out.println("Minimum time taken by KOKO :- "+ans);
    }
}
