package Recursion.TimePassQuestion;

public class Fibonacci {

    static int Fib(int n ){
        if (n<2) return n ;
        return Fib(n-1) + Fib(n-2);
    }

    static void main(String args []) {
        System.out.println(Fib(6));
    }
}
