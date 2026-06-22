package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(); int np = p.length();
        List<Integer> ans = new ArrayList<>();
        if (np >ns) return ans;

        int [] targetFreq  = new int [26];
        int [] windowFreq = new int [26];

        for (int i = 0 ;i<np;i++){
            targetFreq[p.charAt(i)-'a']++;
        }

        for (int i = 0 ; i<np ; i++){
            windowFreq[s.charAt(i)-'a']++;
        }

        if (Arrays.equals(targetFreq,windowFreq)) ans.add(0);

        for (int i = 1 ; i<ns - np+1 ;i++){
            windowFreq[s.charAt(i-1) - 'a']--;
            windowFreq[s.charAt(i+np-1) -'a']++;
            if (Arrays.equals(targetFreq,windowFreq)) ans.add(i);
        }
        return ans;
    }
}
