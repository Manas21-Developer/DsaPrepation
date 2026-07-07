package Java.SlidingWindow;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int [] S1Freq = new int [26];

        // store freq of S1 .
        for (int i = 0 ; i<s1.length();i++){
            char ch = s1.charAt(i);
            S1Freq[ch-'a']++;
        }

        // store freq of s2
        int [] windowFreq = new int [26];
        for (int i =0 ;i <s1.length();i++){
            char ch = s2.charAt(i);
            windowFreq[ch - 'a']++;
        }

        // compare the first window
        if (matches(S1Freq, windowFreq)) return true ;

        int left = 0;

        for (int right = s1.length();right <s2.length();right++){
            // add new character freq
            windowFreq[s2.charAt(right) - 'a']++;

            // remove exisiting freq
            windowFreq[s2.charAt(left) -'a']--;
            // move pointer
            left++;

            //check if match
            if (matches(S1Freq , windowFreq)) return true;
        }return false;
    }

    public boolean matches (int [] a , int [] b){
        for (int i = 0 ;i<26;i++){
            if (a[i] != b[i]) return false ;
        }return true;
    }
}
