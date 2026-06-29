package Recursion.RecrusionEasy;

public class ProductOfNaturalNo {

    static long helper(int n){
        if (n==1) return 1; // input are 1<=n<=10^3;
        return n*helper(n-1);
    }

    static void main(String[] args) {
        System.out.println(helper(4));
    }
}
