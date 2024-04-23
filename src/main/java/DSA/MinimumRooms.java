package DSA;

/*
Given the starting and ending time of the meetings. Find the minimum no of rooms required to
successfully schedule all the meetings without conflict
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MinimumRooms {
    public static void main(String[] args) {
        int start[] = {900, 940, 950, 1100, 1500, 1800};
        int end[] = {910, 1200, 1120, 1130, 1900, 2000};
//        int start[] = {900, 940};
//        int end[] = {910, 1200};
//        int start[] = {100, 300, 500};
//        int end[] = {400, 600, 900};

        List<Integer> mergedList = new ArrayList<>();
        int rooms=0,ans=0;
        int i=0,j=0,m = start.length;

        while (i<m && j<m) {
            if(start[i]<end[j]) {
                mergedList.add(start[i]);
                i++;
                rooms++;
            }
            else if(start[i]>end[j]) {
                mergedList.add(end[j]);
                j++;
                rooms--;
            }
            ans = Math.max(ans, rooms);
        }
        while (i<m) {
            mergedList.add(start[i]);
            i++;
        }
        while (j<m) {
            mergedList.add(end[j]);
            j++;
        }
        System.out.println(mergedList);
        System.out.println(ans);
    }
}
