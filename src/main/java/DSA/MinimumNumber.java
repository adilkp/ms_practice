package DSA;

import java.util.HashMap;
import java.util.Map;

/*
Write a code to arrange a no to find minimum possible no of a given no in o(n) and constant space.
for eg. if the input is 324, output should be 234.
You can assume input in string/int or any other format.
 */

public class MinimumNumber {
    public static void main(String[] args) {
        int n = 814361913;
        Map<Integer, Integer> map = new HashMap<>();

        int t = n;
        while (t>0) {
            if(!map.containsKey(t%10)) {
                map.put(t%10, 1);
            }
            else map.put(t%10, map.get(t%10)+1);
            t=t/10;
        }
        System.out.println(map);
        int ans=0;
        for(int i=1;i<=9;i++) {
            if(map.containsKey(i)) {
                for (int j=0;j<map.get(i);j++) {
                    ans = ans*10 + i;
                }
            }
        }
        System.out.println(ans);
    }
}
