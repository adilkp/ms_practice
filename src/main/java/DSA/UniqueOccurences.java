package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Unique no. of occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:Input: arr = [1,2,2,1,1,3] Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2: Input: arr = [1,2] Output: false
Example 3: Input: arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true
 */
public class UniqueOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if(set.contains(entry.getValue())) return false;
            set.add(entry.getValue());
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
