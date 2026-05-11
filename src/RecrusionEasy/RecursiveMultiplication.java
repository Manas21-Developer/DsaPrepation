package RecrusionEasy;
/*
Recursive Multiplication:
Given two integers n and m, find their multiplication using recursion.
Use only addition and subtraction operators; multiplication (*) is not allowed.
*/
public class RecursiveMultiplication {

    static int helper(int n , int m){
        if (m == 0) return 0 ;
        return  n+ helper(n,m-1);
    }

    static void main(String[] args) {
        System.out.println(helper(10,13)); // 10 *13 = 130
    }
}
