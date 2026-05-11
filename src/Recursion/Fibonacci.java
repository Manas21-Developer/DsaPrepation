package Recursion;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Fibonacci {

    static int Fib(int n ){
        if (n<2) return n ;
        return Fib(n-1) + Fib(n-2);
    }

    static void main(String args []) {
        System.out.println(Fib(6));
    }
}
