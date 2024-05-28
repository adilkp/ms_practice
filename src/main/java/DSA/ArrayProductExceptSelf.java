package DSA;

import java.util.Arrays;

/*
Product of array except self : Input: nums = [1,2,3,4]  Output: [24,12,8,6]
 */
public class ArrayProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int sum=1,index=0,count=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0)
                sum*=nums[i];
            else {
                flag=false;
                index=i;
                count++;
            }
        }
        if(flag==false) {
            Arrays.fill(nums,0);
            if(count==1) {
                nums[index] = sum;
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] = (sum/nums[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        Arrays.stream(productExceptSelf(nums)).forEach((e) -> System.out.print(e+" "));
    }
}
