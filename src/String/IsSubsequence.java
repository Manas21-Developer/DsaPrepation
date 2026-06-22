package String;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int p1 = 0 ;
        int p2 = 0;
        while (p1 <s.length() && p2 <t.length()){
            char ch1 = s.charAt(p1);
            char ch2 = t.charAt(p2);

            if (ch1 == ch2) {
                p1++;
            }
            p2++;
        }return (p1 == s.length())?true :false;
    }

    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = "ahbgdc";
        System.out.println("if s1 is is Sequence of s2 so it give ture else false :- "+isSubsequence(s1,s2));

    }
}
