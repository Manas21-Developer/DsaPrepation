package TwoPointer;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int s = 0 ;
        int e = numbers.length-1;
        while (s<e){
            int sum = numbers[s]+numbers[e];
            if (sum == target) return new int[] {s+1,e+1};
            else if (sum >target) e--;
            else s++;
        }return new int [] {-1,-1};
    }

    static void main(String[] args) {
        int[] arr = {2,5,6,78,9};
        int [] ans =  twoSum(arr,8);
        System.out.print("Target present at index :- " +ans[0] +","+ ans[1]);
    }
}
