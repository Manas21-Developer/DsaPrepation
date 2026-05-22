package String;

import java.util.*;

public class GroupOfAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        //      if (strs.length >= 1) return new ArrayList<>(str);
        for (String i : strs){
            char [] arr = i.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(i);
        }return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}
