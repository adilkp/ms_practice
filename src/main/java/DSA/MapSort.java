package DSA;

import java.util.*;

/*
    Sort a map by value
 */

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}

public class MapSort {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        map.put(1, 5);
        map.put(2, 4);
        map.put(3, 1);
        map.put(4, 3);
        map.put(5, 2);
        System.out.println(map);
        List<Integer> list = new ArrayList();
        for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
            list.add(mp.getValue());
        }
        Collections.sort(list, new CustomComparator());

        for(Integer i:list) {
            for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
                if(mp.getValue()==i) {
                    sortedMap.put(mp.getKey(), i);
                }
            }
        }
        sortedMap.forEach((k,v) -> {
            System.out.println(k+" : "+v);
        });
    }
}
