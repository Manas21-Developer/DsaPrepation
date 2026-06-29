package Recursion.String;

import java.util.ArrayList;

public class SubsequeceInString {
    static void main(String[] args) {
        System.out.println(helper("", "abc"));

    }
    static ArrayList<String> helper(String output , String input  ){
        if (input.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(output);
            return list;
        }

        char ch = input.charAt(0);
        ArrayList<String> left =helper(output +ch, input.substring(1) ); // taking the element
        ArrayList<String> right = helper(output, input.substring(1)); // not taking the element
        left.addAll(right);
        return  left;
    }

}
