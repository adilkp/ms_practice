package DSA;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
non-zero elements.
Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 */
public class MoveZerosToRight {
    public static void moveZeroes(int[] nums) {
        int l=0,m=0,n=nums.length;
        while (l<n){
            if(nums[l]!=0) {
                nums[m] = nums[l];
                m++;
            }
            l++;
        }
        while (m<n) {
            nums[m]=0;
            m++;
        }
    }

    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
