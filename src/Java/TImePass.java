package Java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TImePass {

    static void main(String[] args) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        Map<Integer,Integer> treeMap = new TreeMap<>();
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(1,4);hashMap.put(3,2);hashMap.put(4,6);hashMap.put(2,7);
        treeMap.put(1,4);treeMap.put(3,2);treeMap.put(4,6);treeMap.put(2,7);
        linkedHashMap.put(1,4);linkedHashMap.put(3,2);linkedHashMap.put(4,6);linkedHashMap.put(2,7);
        System.out.println(hashMap);
        System.out.println(treeMap);
        System.out.println(linkedHashMap);

    }
}
