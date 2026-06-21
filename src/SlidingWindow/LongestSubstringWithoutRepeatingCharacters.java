package SlidingWindow;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0 ;
        int left = 0;
        int right = 0;
        int [] hash = new int [256];
        for (int i =0 ; i<hash.length ;i++) {
            hash[i] = -1;
        }
        while (right <s.length()){
            char ch = s.charAt(right);
            if (hash[ch] != -1){
                if (hash[ch] >=left){
                    left = hash[ch] +1;
                }
            }
            int len = right -left +1;
            maxLen = Math.max(maxLen,len);
            hash[ch] = right;
            right++;
        }return  maxLen;
    }
}
