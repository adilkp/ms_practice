package LRUCache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCacheMain {
    static List<Integer> dll = new LinkedList<>();
    static Map<Integer, Integer> map = new HashMap<>();
    static int capacity;
    public LRUCacheMain(int capacity) {
        this.capacity=capacity;
    }
    public static int get(int key) {
        if(map.containsKey(key)) {
            int index = dll.indexOf(key);
            dll.remove(index);
            dll.add(0, key);
            return key;
        }
        return -1;
    }

    public static void put(int key, int value) {
        if(map.size()+1>capacity) {
            map.remove(dll.getLast());
            dll.removeLast();
            dll.add(0,key);
            map.put(key,value);
        }
        else if(map.containsKey(key)) {
            map.put(key,value);
            dll.remove(dll.indexOf(key));
            dll.add(0,key);
        }
        else {
            map.put(key,value);
            dll.add(0,key);
        }
    }

    public static void main(String[] args) {
        LRUCacheMain lruCacheMain = new LRUCacheMain(2);
        put(1,1);
        System.out.println(map);
        System.out.println(dll);
        put(2,2);
        System.out.println(get(1));
        System.out.println(map);
        System.out.println(dll);
        put(3,3);
        System.out.println(map);
        System.out.println(dll);
        System.out.println(get(2));
        put(4,4);
        System.out.println(map);
        System.out.println(dll);
        System.out.println(get(1));
        System.out.println(get(3));
        System.out.println(get(4));
    }
}
