package RecrusionEasy;

public class SumOfNaturalNo {

    static int NumberSum(int n){
        if (n ==1) return 1;
        return  n+NumberSum(n-1);
    }

    static void main(String args []) {
        System.out.println(NumberSum(4)); // ans = 15(5+4+3+2+1);
    }
}
