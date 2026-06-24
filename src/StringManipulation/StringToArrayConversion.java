package StringManipulation;

import java.util.ArrayList;
import java.util.List;

public class StringToArrayConversion {
    public static List<Integer> helper (String s){
        List<Integer> ans = new ArrayList<>();

        String [] part = s.split(","); // here "1-3" , "5-7" , "9" => {"1-3", "5-7", "9"}

        for (String ele : part){
            if(ele.contains("-")){
                String [] range = ele.split("-");
                int start = Integer.parseInt(range[0]);
                int end = Integer.parseInt(range[1]);

                for (int i = start ;i<=end;i++){
                    ans.add(i);
                }
            }else {
                ans.add(Integer.parseInt(ele));
            }
        }return ans ;
    }

    public static void main(String[] args) {
        String given = "1-3,5-7,9";
        System.out.print(helper(given));
    }
}
