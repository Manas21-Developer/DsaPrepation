package Recursion;
import java.util.*;

public class OneToN {
    // here we need to print number
    // number is given by the user and we need to print from 1 to n (Number given by the user ).
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        helper(num);
        sc.close();

    }
    public static void helper(int num){
        if (num == 0) {
            return ;
        }
        helper(num-1);
        System.out.println(num);

    }
}
