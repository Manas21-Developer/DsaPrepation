package String;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        int ns = s.length() ;
        int nt = t.length();
        if (ns != nt) return false;
        int [] ans = new int [26];
        for (int i  =0 ;i<ns;i++){
            ans[s.charAt(i) -'a']++; // increase the freqq of the character
            ans[t.charAt(i) -'a']--; // decrease rhe freqq of the character
        }

        for (int cnt : ans){
            if (cnt != 0) return false;
        }
        return true ;
    }

    static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println("if string are anagram return true otherwise return fasle :- " + isAnagram(s1,s2));
    }
}
