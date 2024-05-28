package DSA;

import java.util.Arrays;

/*
Maximum average sub array : Input: nums = [1,12,-5,-6,50,3], k = 4 Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class MaxAverageSubArray {

    public static double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        for(int i=0;i<k;i++) ans+=nums[i];
        double sum=ans;
        for(int i=1;i<nums.length-k+1;i++) {
            sum = sum + nums[i+k-1] - nums[i-1];
            ans = ans>sum?ans:sum;
        }
        return ans/k;
    }

    public static void main(String[] args) {
        int arr[] ={4,2,1,3,3};
        System.out.println(findMaxAverage(arr, 2));
    }
}
