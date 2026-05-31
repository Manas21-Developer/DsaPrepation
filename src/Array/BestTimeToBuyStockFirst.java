package Array;

public class BestTimeToBuyStockFirst {
    public static int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        int n = prices.length;
        for(int i = 1 ; i <n;i++){
            int cost = prices[i] - min;
            ans = Math.max(ans,cost);
            min = Math.min(min,prices[i]);
        }return ans;
    }

    static void main(String[] args) {
        int [] arr  = {7,1,5,3,6,4};
        System.out.println("Maximum profit :- "+maxProfit(arr));
    }
}
