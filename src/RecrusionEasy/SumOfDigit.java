package RecrusionEasy;

public class SumOfDigit {

    static  int helper(int n){
        n = Math.abs(n); // it handle the negative value like :- -1432 getting the answer;
        if (n<1) return 0;
        return n%10 + helper(n/10);
    }
    static void main(String [] args) {
        System.out.println(helper(1432));
        System.out.println(helper(-1432)); // if i am not adding 6 line the answer is 0;
    }

}
