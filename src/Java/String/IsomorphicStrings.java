package Java.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map <Character , Character > mapS = new HashMap<>();
        Map <Character , Character>  mapT = new HashMap<>();

        for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            char th = t.charAt(i);
            if ((mapS.containsKey(ch) && mapS.get(ch) != th) ||
                    (mapT.containsKey(th) && mapT.get(th) != ch ))
            {
                return false;
            }
            mapS.put (ch , th);
            mapT.put (th,ch);
        }return true;
    }
}
