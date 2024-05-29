package DSA;

import java.util.ArrayList;
import java.util.List;

/*
Kids with greatest no. of candies
Input: candies = [2,3,5,1,3], extraCandies = 3  Output: [true,true,true,false,true]
  Explanation: If you give all extraCandies to:
  Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
  Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
  Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
  Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
  Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
public class KidsWithMaxCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans= new ArrayList<>();
        int n = candies.length,max = 0;
        for(int i=0;i<n;i++)
            max=max<candies[i]?candies[i]:max;
        for(int i=0;i<n;i++) {
            if(max<=extraCandies+candies[i]) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int k = 3;
        System.out.println(kidsWithCandies(candies,k));
    }
}
