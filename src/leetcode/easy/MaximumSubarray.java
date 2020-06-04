package leetcode.easy;


/**
 * 53、Maximum Subarray
 Description
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

 Example:

 Input: [-2,1,-3,4,-1,2,1,-5,4],
 Output: 6
 Explanation: [4,-1,2,1] has the largest sum = 6.
 Follow up:

 If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 Tags: Array, Divide and Conquer, Dynamic Programming
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static  int maxSubArray(int[] nums) {
        int temp=nums[0],max=temp,len=nums.length;
        for (int i=1;i<len;i++){
            temp=nums[i]+(temp>0?temp:0);
            if (temp>max)max=temp;
        }
            return max;
    }

}
