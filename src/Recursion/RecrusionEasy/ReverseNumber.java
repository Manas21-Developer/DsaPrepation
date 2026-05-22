package Recursion.RecrusionEasy;

public class ReverseNumber {

    // itreative
    static int helperIterative(int n) {
        boolean isNegative = n < 0; // this is to handle the negative number
        if (isNegative) {
            n = -n;
        }

        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return isNegative ? -ans : ans;
    }
    // Recursive
    static int sum = 0;
    static void helperRecursive(int n){
        if (n == 0) return;
        int rem = n%10;
        sum = sum*10+rem;
        helperRecursive(n/10);
    }

    static void main(String[] args)
    {
        helperRecursive(1234);
        System.out.println(sum);
//        System.out.println(helperIterative(1432));
//        System.out.println(helperIterative(-1432));
    }

}