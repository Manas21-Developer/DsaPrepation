package RecrusionEasy;

public class CountZeroInNumber {

    static int helper(int n , int cnt){
        if (n == 0) return cnt;
         int rem = n%10;
         if (rem == 0) return helper(n/10,cnt+1);
         else return helper(n/10,cnt);
    }

    static void main(String[] args) {
        System.out.println(helper(304001002,0));
    }
}
